import java.util.ArrayList;
import java.util.Date;

public class Employee {
    private String name;
    private String email;
    private String phoneNumber;
    private Date birthDate;
    private int salary;
    private ArrayList<Task> completedTasks;

    public Employee(String name, String email, String phoneNumber, Date birthDate, int salary, ArrayList<Task> completedTasks) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.salary = salary;
        this.completedTasks = completedTasks;
    }
}
