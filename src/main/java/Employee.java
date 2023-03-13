import java.sql.Date;
import java.util.ArrayList;

public class Employee {
    private int employeeId;
    private String name;
    private String email;
    private String phoneNumber;
    private Date birthDate;
    private int salary;
    private Task assignedTask;
    private ArrayList<Task> completedTasks;

    public Employee(int employeeId, String name, String email, String phoneNumber, Date birthDate, int salary, Task assignedTask, ArrayList<Task> completedTasks) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.salary = salary;
        this.completedTasks = completedTasks;
        this.assignedTask = assignedTask;
    }

    public Task getAssignedTask() {
        return assignedTask;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getSalary() {
        return salary;
    }

    public ArrayList<Task> getCompletedTasks() {
        return completedTasks;
    }
}
