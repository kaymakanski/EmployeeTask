import java.util.Date;

public class Task {
    private String title;
    private String description;
    private Employee assignee;
    private Date dueDate;

    public Task(String title, String description, Employee assignee, Date dueDate) {
        this.title = title;
        this.description = description;
        this.assignee = assignee;
        this.dueDate = dueDate;
    }
}
