import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      /*  String url = "jdbc:mysql://localhost:3306/employee_task";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);*/
        //Statement statement = connection.createStatement();


        /* ~~~Fetching data from the database~~~

        String query1 = "select name from employee where employee_id=1";
        String query2 = "select * from employee";
        ResultSet resultSet = statement.executeQuery(query2);

        String employeeData = "";

        while (resultSet.next()) {
            employeeData = resultSet.getInt(1) + " : " + resultSet.getString(2);
            System.out.println(employeeData);
        }*/

        /*EmployeeBuilder employeeBuilder = new EmployeeBuilder();
        employeeBuilder.setEmployeeId(5);
        employeeBuilder.setName("Johny Walker");
        employeeBuilder.setEmail("johny.walker@abv.bg");
        employeeBuilder.setPhoneNumber("+359 7777 999");
        employeeBuilder.setSalary(30000);
        employeeBuilder.setBirthDate("1993-05-05");
        Employee employee = employeeBuilder.getEmployee();*/

        EmployeeDAO employeeDAO = new EmployeeDAO();
        TaskDAO taskDAO = new TaskDAO();

        /*Employee employee1 = employeeDAO.getEmployee(2);
        System.out.println(employee1.getName());
        System.out.println(employee1.getEmail());

        employeeDAO.deleteEmployee(5);*/

       /* ArrayList<Employee> allEmployees = employeeDAO.getAllEmployees();
        for (Employee e : allEmployees){
            System.out.println(e.getName() + " " + e.getEmail() + " " + e.getPhoneNumber() + " " + e.getSalary());
        }*/

        employeeDAO.updateEmployee(2, "name", "Johny Walker");
        System.out.println(employeeDAO.getEmployee(2).getName());

        taskDAO.deleteTask(4);
    }
}