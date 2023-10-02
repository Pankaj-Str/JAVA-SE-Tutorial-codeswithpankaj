import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDataExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        String selectQuery = "SELECT * FROM employees";

        try {
            // Establish a connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a PreparedStatement for the SELECT query
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);

            // Execute the SELECT query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Process the results
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");

                System.out.println("ID: " + id);
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("------");
            }

            // Close resources
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
