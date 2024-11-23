import java.sql.*;

class Q21DisplayStudentRecords {
    public static void main(String args[]) {
        try {
            // Load JDBC-ODBC Driver (Deprecated but still works in legacy systems)
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            // Establish a connection to the database
            Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/Q21DB","USERNAME","PASSWORD");

            // Prepare a SQL statement with a placeholder for rollno
            PreparedStatement st = c.prepareStatement("SELECT * FROM STUDENTTABLE WHERE rollno=?");

            // Set the rollno to 3
            st.setInt(1, 3);

            // Execute the query
            ResultSet rs = st.executeQuery();

            // Print headers for clarity
            System.out.println("Roll No\tName\tMarks");

            // Loop through the result set and display the values
            while (rs.next()) {
                System.out.print(rs.getInt(1));      // Roll no
                System.out.print("\t" + rs.getString(2)); // Name
                System.out.println("\t" + rs.getInt(3)); // Marks
            }

            // Close all the resources
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
