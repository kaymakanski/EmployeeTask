import java.util.Date;

public class Task {
    private String title;
    private String description;
    private Employee assignee;
    private Date dueDate;
    private String status;

    public Task(String title, String description, Employee assignee, Date dueDate, String status) {
        this.title = title;
        this.description = description;
        this.assignee = assignee;
        this.dueDate = dueDate;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Employee getAssignee() {
        return assignee;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return status;
    }
}
