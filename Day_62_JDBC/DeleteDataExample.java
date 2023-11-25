import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDataExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        // Define the ID of the employee to delete
        int employeeIdToDelete = 1; // Change this to the ID of the employee you want to delete

        String deleteQuery = "DELETE FROM employees WHERE id = ?";

        try {
            // Establish a connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a PreparedStatement for the DELETE query
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);

            // Set the ID value for the placeholder in the SQL query
            preparedStatement.setInt(1, employeeIdToDelete);

            // Execute the DELETE statement
            int rowsDeleted = preparedStatement.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Employee record was deleted successfully!");
            } else {
                System.out.println("No employee record was deleted.");
            }

            // Close resources
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
