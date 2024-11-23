/*
 * This program connects to a database using the Type 2 JDBC driver and adds new employee records.
 * It inserts a sample record into the EMPLOYEETABLE and displays a success message.
 */
package q19addemployeerecords;

import java.sql.*;

public class Q19AddEmployeeRecords {
    public static void main(String args[]) {
        try {
            // Load the Type 2 JDBC driver
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            // Establish connection using the Type 2 driver
            Connection c = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/Q19DB", "UserName", "Password"
            );

            // Create a Statement object
            Statement st = c.createStatement();

            // SQL query to insert a new employee record
            String sql = "INSERT INTO EMPLOYEETABLE (SNAME, EMPID, SALARY) VALUES " +
                         "('John Doe', 101, 55000)";

            // Execute the query
            int rowsAffected = st.executeUpdate(sql);

            // Display success or failure message
            if (rowsAffected > 0) {
                System.out.println("Record added successfully!");
            } else {
                System.out.println("No record was added.");
            }

            // Close all resources
            st.close();
            c.close();

        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
