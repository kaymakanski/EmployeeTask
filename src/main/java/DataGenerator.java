import java.sql.Date;
import java.util.ArrayList;

public class DataGenerator {
    public static void generateFreshData(){
        EmployeeBuilder employeeBuilder = new EmployeeBuilder();
        EmployeeDAO employeeDAO = new EmployeeDAO();
        TaskBuilder taskBuilder = new TaskBuilder();
        TaskDAO taskDAO = new TaskDAO();

        ArrayList<Employee> employees = employeeDAO.getAllEmployees();
        if(!(employees.isEmpty())){
            for (Employee e : employees){
                employeeDAO.deleteEmployee(e.getName());
            }
        }
        ArrayList<Task> tasks = taskDAO.getAllTasks();
        if(!(tasks.isEmpty())){
            for (Task t : tasks){
                taskDAO.deleteTask(t.getTitle());
            }
        }


        employeeBuilder.setName("John Snow");
        employeeBuilder.setEmail("john.snow@abv.bg");
        employeeBuilder.setPhoneNumber("+359 5555 555");
        employeeBuilder.setSalary(2000);
        employeeBuilder.setBirthDate(Date.valueOf("1991-01-01"));
        employeeDAO.addEmployee(employeeBuilder.getEmployee());

        employeeBuilder.setName("Johny Cash");
        employeeBuilder.setEmail("johny.cash@abv.bg");
        employeeBuilder.setPhoneNumber("+359 5555 556");
        employeeBuilder.setSalary(3000);
        employeeBuilder.setBirthDate(Date.valueOf("1992-01-01"));
        employeeDAO.addEmployee(employeeBuilder.getEmployee());

        employeeBuilder.setName("Johny Bravo");
        employeeBuilder.setEmail("johny.bravo@abv.bg");
        employeeBuilder.setPhoneNumber("+359 5555 557");
        employeeBuilder.setSalary(4000);
        employeeBuilder.setBirthDate(Date.valueOf("1993-01-01"));
        employeeDAO.addEmployee(employeeBuilder.getEmployee());

        employeeBuilder.setName("Johny Walker");
        employeeBuilder.setEmail("johny.walker@abv.bg");
        employeeBuilder.setPhoneNumber("+359 5555 558");
        employeeBuilder.setSalary(5000);
        employeeBuilder.setBirthDate(Date.valueOf("1994-01-01"));
        employeeDAO.addEmployee(employeeBuilder.getEmployee());

        employeeBuilder.setName("Chuck Norris");
        employeeBuilder.setEmail("abv@chucknorris.bg");
        employeeBuilder.setPhoneNumber("+359 5555 666");
        employeeBuilder.setSalary(Integer.MAX_VALUE);
        employeeBuilder.setBirthDate(Date.valueOf("1969-01-01"));
        employeeDAO.addEmployee(employeeBuilder.getEmployee());

        employeeBuilder.setName("John Wick");
        employeeBuilder.setEmail("john.wick@abv.bg");
        employeeBuilder.setPhoneNumber("+359 5555 755");
        employeeBuilder.setSalary(6000);
        employeeBuilder.setBirthDate(Date.valueOf("1991-02-01"));
        employeeDAO.addEmployee(employeeBuilder.getEmployee());

        employeeBuilder.setName("John Travolta");
        employeeBuilder.setEmail("john.travolta@abv.bg");
        employeeBuilder.setPhoneNumber("+359 7777 555");
        employeeBuilder.setSalary(7000);
        employeeBuilder.setBirthDate(Date.valueOf("1971-01-01"));
        employeeDAO.addEmployee(employeeBuilder.getEmployee());

        /*-------------------------------------------------------------------------*/


        taskBuilder.setTitle("Walk");
        taskBuilder.setDescription("Start walking!");
        taskBuilder.setDueDate(Date.valueOf("2023-03-13"));
        taskBuilder.setStatus("completed");
        taskDAO.addTask(taskBuilder.getTask());

        taskBuilder.setTitle("Run");
        taskBuilder.setDescription("Start running!");
        taskBuilder.setDueDate(Date.valueOf("2023-03-14"));
        taskBuilder.setStatus("assigned");
        taskDAO.addTask(taskBuilder.getTask());

        taskBuilder.setTitle("Chuck Norris Kick");
        taskBuilder.setDescription("Deliver a spinning heel kick!");
        taskBuilder.setDueDate(Date.valueOf("2023-04-13"));
        taskBuilder.setStatus("new");
        taskDAO.addTask(taskBuilder.getTask());

        taskBuilder.setTitle("Sleep");
        taskBuilder.setDescription("Go to sleep!");
        taskBuilder.setDueDate(Date.valueOf("2023-03-13"));
        taskBuilder.setStatus("completed");
        taskDAO.addTask(taskBuilder.getTask());

        taskBuilder.setTitle("Code");
        taskBuilder.setDescription("Start coding!");
        taskBuilder.setDueDate(Date.valueOf("2123-03-13"));
        taskBuilder.setStatus("indefinite");
        taskDAO.addTask(taskBuilder.getTask());
    }
}
