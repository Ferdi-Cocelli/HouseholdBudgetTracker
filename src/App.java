import com.util.ConnectionConfiguration;

import java.sql.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Connection connection = null;
        Scanner inputFromScanner = new Scanner(System.in);

        try {
            connection = ConnectionConfiguration.getConnection();
            Statement statement = connection.createStatement();

            if(connection != null){
                System.out.println("Connection Successful...");
            }

            System.out.println("Enter monthly salary: ");
            int monthlySalary = inputFromScanner.nextInt();

            statement.executeUpdate("insert into salaryInfo value(monthlySalary)");
            System.out.println("VALUES INSERTED SUCCESSFULLY...");


        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if( connection!= null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
