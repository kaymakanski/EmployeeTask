import java.util.Date;

public class TaskBuilder {
    private String title;
    private String description;
    private Employee assignee;
    private Date dueDate;

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
        return new Task(title, description, assignee, dueDate);
    }
}
