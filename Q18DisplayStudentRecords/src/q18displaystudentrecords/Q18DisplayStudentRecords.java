/*
 * This program connects to a database and retrieves student records using a Statement.
 * It displays the Roll No, Name, and Marks of the students from the STUDENTTABLE.
 */
package q18displaystudentrecords;

import java.sql.*;

public class Q18DisplayStudentRecords {
    public static void main(String args[]) {
        try {
            // Establish connection to the database
            Connection c = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/Q18DB", "UserName", "Password"
            );

            // Create a Statement object
            Statement st = c.createStatement();

            // Execute the query and retrieve results
            ResultSet rs = st.executeQuery("SELECT * FROM STUDENTTABLE");

            // Print column headers
            System.out.println("Roll No\tName     \tMarks");

            // Loop through the result set and display each record
            while (rs.next()) {
                System.out.print(" " + rs.getInt("ROLLNO"));  // Roll No
                System.out.print("\t" + rs.getString("SNAME")); // Name
                System.out.println("\t" + rs.getInt("MARKS")); // Marks
            }

            // Close all resources
            rs.close();
            st.close();
            c.close();

        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
