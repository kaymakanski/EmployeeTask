import java.sql.*;
import java.util.ArrayList;

public class TaskDAO {
    private final Connection connection = DatabaseConnector.connect();
    private final TaskBuilder taskBuilder = new TaskBuilder();

    public Task getTask(int id) {
        taskBuilder.setTaskId(id);
        try {
            String query = "select * from task where task_id=" + id;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            taskBuilder.setTitle(resultSet.getString("title"));
            taskBuilder.setDescription(resultSet.getString("description"));
            taskBuilder.setDueDate(resultSet.getDate("duedate"));
            taskBuilder.setStatus(resultSet.getString("status"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return taskBuilder.getTask();
    }

    public Task getTask(String title) {
        taskBuilder.setTitle(title);
        try {
            String query = "select * from task where title=" + title;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            taskBuilder.setTaskId(resultSet.getInt("task_id"));
            taskBuilder.setDescription(resultSet.getString("description"));
            taskBuilder.setDueDate(resultSet.getDate("duedate"));
            taskBuilder.setStatus(resultSet.getString("status"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return taskBuilder.getTask();
    }

    public ArrayList<Task> getAllTasks(){
        ArrayList<Task> allTasks = new ArrayList<>();
        try {
            String query = "select * from task";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                taskBuilder.setTaskId(resultSet.getInt("task_id"));
                taskBuilder.setTitle(resultSet.getString("title"));
                taskBuilder.setDescription(resultSet.getString("description"));
                taskBuilder.setDueDate(resultSet.getDate("duedate"));
                taskBuilder.setStatus(resultSet.getString("status"));
                allTasks.add(taskBuilder.getTask());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return allTasks;
    }

    public void addTask(Task task) {
        String query = "insert into task values (?,?,?,?,?)";
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(query);
            statement.setInt(1, task.getTaskId());
            statement.setString(2, task.getTitle());
            statement.setString(3, task.getDescription());
            statement.setDate(4, task.getDueDate());
            statement.setString(5, task.getStatus());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateTask(int id, String columnToUpdate, String newValue){
        String query = "update task set " + columnToUpdate + "='" + newValue + "' where task_id=" + id;
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void updateTask(int id, String columnToUpdate, Date newValue){
        String query = "update task set " + columnToUpdate + "='" + newValue + "' where task_id=" + id;
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteTask(int id){
        String query = "delete from task where task_id=" + id;
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void deleteTask(String title){
        String query = "delete from task where title=" + title;
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
