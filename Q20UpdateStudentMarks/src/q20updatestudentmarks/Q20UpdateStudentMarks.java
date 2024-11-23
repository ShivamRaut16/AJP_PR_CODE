import java.sql.*;

public class Q20UpdateStudentMarks {
    public static void main(String[] args) {
        try {
            // Load the Type 2 JDBC driver
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            // Establish connection to the database
            Connection connection = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/Q20DB", "USERNAME", "PASSWORD"
            );

            // Create a Statement object
            Statement statement = connection.createStatement();

            // SQL query to update marks of the student with rollno = 2
            String updateQuery = "UPDATE STUDENTTABLE SET MARKS = 85 WHERE ROLLNO = 2";

            // Execute the update query
            int rowsUpdated = statement.executeUpdate(updateQuery);

            // Display result message
            if (rowsUpdated > 0) {
                System.out.println("Marks updated successfully for rollno = 2.");
            } else {
                System.out.println("No records found with rollno = 2.");
            }

            // Close the resources
            statement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
