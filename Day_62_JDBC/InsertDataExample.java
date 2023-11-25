import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDataExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        // Define the data to be inserted
        String firstName = "John";
        String lastName = "Doe";

        String insertQuery = "INSERT INTO employees (first_name, last_name) VALUES (?, ?)";

        try {
            // Establish a connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            // Set values for the placeholders in the SQL query
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);

            // Execute the INSERT statement
            int rowsInserted = preparedStatement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("A new employee record was inserted successfully!");
            } else {
                System.out.println("Insertion failed.");
            }

            // Close resources
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
