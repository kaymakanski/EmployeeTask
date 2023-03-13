import org.w3c.dom.ls.LSOutput;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //DataGenerator.generateFreshData();
        System.out.println();
        System.out.println("Employees:");
        printEmployees();
        System.out.println();
        System.out.println("Tasks:");
        printTasks();

        EmployeeDAO employeeDAO = new EmployeeDAO();
        TaskDAO taskDAO = new TaskDAO();

        employeeDAO.updateEmployee(10, "phonenumber", "11111111111");
        System.out.println("Updated employee table:");
        printEmployees();


    }

    public static void printEmployees(){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        ArrayList<Employee> allEmployees = employeeDAO.getAllEmployees();

        System.out.println("ID   Name            Email         Phone number     Salary      Date of birth");
        System.out.println("--------------------------------------------------------------------------------------------");
        for (Employee e : allEmployees){
            System.out.println(e.getEmployeeId() + " | " + e.getName() + "   " + e.getEmail() + "    " + e.getPhoneNumber() + "     " + e.getSalary() + "       " + e.getBirthDate());
            System.out.println("___________________________________________________________________________________________");
        }
    }
    public static void printTasks(){
        TaskDAO taskDAO = new TaskDAO();
        ArrayList<Task> allTasks = taskDAO.getAllTasks();

        System.out.println("ID   Title    Description    Due date       Status");
        System.out.println("------------------------------------------------------------------------");
        for (Task t : allTasks){
            System.out.println(t.getTaskId() + " | " + t.getTitle() + "   " + t.getDescription() + "    " + t.getDueDate() + "    " + t.getStatus());
            System.out.println("_________________________________________________________________________________________");
        }
    }



}