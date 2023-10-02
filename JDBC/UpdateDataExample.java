import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDataExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        // Define the data to update
        int employeeIdToUpdate = 1; // Change this to the ID of the employee you want to update
        String newFirstName = "UpdatedFirstName";
        String newLastName = "UpdatedLastName";

        String updateQuery = "UPDATE employees SET first_name = ?, last_name = ? WHERE id = ?";

        try {
            // Establish a connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a PreparedStatement for the UPDATE query
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

            // Set new values for the placeholders in the SQL query
            preparedStatement.setString(1, newFirstName);
            preparedStatement.setString(2, newLastName);
            preparedStatement.setInt(3, employeeIdToUpdate);

            // Execute the UPDATE statement
            int rowsUpdated = preparedStatement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Employee record was updated successfully!");
            } else {
                System.out.println("No employee record was updated.");
            }

            // Close resources
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
