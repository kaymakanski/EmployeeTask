import java.sql.Date;

public class Task {
    private int taskId;
    private String title;
    private String description;
    private Employee assignee;
    private Date dueDate;
    private String status;

    public Task(int taskId, String title, String description, Employee assignee, Date dueDate, String status) {
        this.taskId = taskId;
        this.title = title;
        this.description = description;
        this.assignee = assignee;
        this.dueDate = dueDate;
        this.status = status;
    }

    public int getTaskId() {
        return taskId;
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
