import java.util.Date;

public class Task {
    private String title;
    private String description;
    private Employee assignee;
    private Date dueDate;

    public Task(String title, Employee assignee, Date dueDate) {
        this.title = title;
        this.assignee = assignee;
        this.dueDate = dueDate;
    }
    public Task() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getAssignee() {
        return assignee;
    }

    public void setAssignee(Employee assignee) {
        this.assignee = assignee;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
