import java.sql.*;
import java.util.ArrayList;

public class EmployeeDAO {
    private final Connection connection = DatabaseConnector.connect();
    private final EmployeeBuilder employeeBuilder = new EmployeeBuilder();

    public Employee getEmployee(int id) {
        employeeBuilder.setEmployeeId(id);
        try {
            String query = "select * from employee where employee_id=" + id;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            employeeBuilder.setName(resultSet.getString("name"));
            employeeBuilder.setEmail(resultSet.getString("email"));
            employeeBuilder.setPhoneNumber(resultSet.getString("phonenumber"));
            employeeBuilder.setSalary(resultSet.getInt("salary"));
            employeeBuilder.setBirthDate(resultSet.getDate("birthdate"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employeeBuilder.getEmployee();
    }

    public Employee getEmployee(String name) {
        employeeBuilder.setName(name);
        try {
            String query = "select * from employee where name=" + name;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            employeeBuilder.setEmployeeId(resultSet.getInt("employee_id"));
            employeeBuilder.setEmail(resultSet.getString("email"));
            employeeBuilder.setPhoneNumber(resultSet.getString("phonenumber"));
            employeeBuilder.setSalary(resultSet.getInt("salary"));
            employeeBuilder.setBirthDate(resultSet.getDate("birthdate"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employeeBuilder.getEmployee();
    }

    public ArrayList<Employee> getAllEmployees(){
        ArrayList<Employee> allEmployees = new ArrayList<>();
        try {
            String query = "select * from employee";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                employeeBuilder.setEmployeeId(resultSet.getInt("employee_id"));
                employeeBuilder.setName(resultSet.getString("name"));
                employeeBuilder.setEmail(resultSet.getString("email"));
                employeeBuilder.setPhoneNumber(resultSet.getString("phonenumber"));
                employeeBuilder.setSalary(resultSet.getInt("salary"));
                employeeBuilder.setBirthDate(resultSet.getDate("birthdate"));
                allEmployees.add(employeeBuilder.getEmployee());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return allEmployees;
    }

    public void addEmployee(Employee employee) {
        String query = "insert into employee values (?,?,?,?,?,?)";
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(query);
            statement.setInt(1, employee.getEmployeeId());
            statement.setString(2, employee.getName());
            statement.setString(3, employee.getEmail());
            statement.setString(4, employee.getPhoneNumber());
            statement.setInt(5, employee.getSalary());
            statement.setDate(6, employee.getBirthDate());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateEmployee(int id, String columnToUpdate, String newValue){
        String query = "update employee set " + columnToUpdate + "='" + newValue + "' where employee_id=" + id;
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void updateEmployee(int id, String columnToUpdate, int newValue){
        String query = "update employee set " + columnToUpdate + "='" + newValue + "' where employee_id=" + id;
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteEmployee(int id){
        String query = "delete from employee where employee_id=" + id;
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteEmployee(String name){
        String query = "delete from employee where name='" + name +"'";
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
