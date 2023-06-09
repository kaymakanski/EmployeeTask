import java.sql.Date;
import java.util.ArrayList;

public class EmployeeBuilder {
    private int employeeId;
    private String name;
    private String email;
    private String phoneNumber;
    private Date birthDate;
    private int salary;
    private Task assignedTask;
    private ArrayList<Task> completedTasks;

    public EmployeeBuilder setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public EmployeeBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public EmployeeBuilder setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public EmployeeBuilder setSalary(int salary) {
        this.salary = salary;
        return this;
    }

    public EmployeeBuilder setAssignedTask(Task assignedTask) {
        this.assignedTask = assignedTask;
        return this;
    }

    public EmployeeBuilder setCompletedTasks(ArrayList<Task> completedTasks) {
        this.completedTasks = completedTasks;
        return this;
    }

    public EmployeeBuilder addCompletedTask(Task completedTask){
        this.completedTasks.add(completedTask);
        return this;
    }

    public Employee getEmployee(){
        return new Employee(employeeId, name, email, phoneNumber, birthDate, salary, assignedTask, completedTasks);
    }
}
