import java.sql.Date;

public class TaskBuilder {
    private int taskId;
    private String title;
    private String description;
    private Employee assignee;
    private Date dueDate;
    private String status;

    public TaskBuilder setTaskId(int taskId) {
        this.taskId = taskId;
        return this;
    }

    public TaskBuilder setStatus(String status) {
        this.status = status;
        return this;
    }

    public TaskBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public TaskBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public TaskBuilder setAssignee(Employee assignee) {
        this.assignee = assignee;
        return this;
    }

    public TaskBuilder setDueDate(Date dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public Task getTask(){
        return new Task(taskId, title, description, assignee, dueDate, status);
    }
}
