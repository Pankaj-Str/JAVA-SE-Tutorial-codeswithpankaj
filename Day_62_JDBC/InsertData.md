#  Insert data into mysql Database

To insert data into a MySQL database using Java and JDBC, follow these steps. I'll provide you with an example of inserting data into a hypothetical "employees" table with columns "id," "first_name," and "last_name."

1. **Import Necessary Packages**: In your Java code, import the necessary JDBC packages.

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
```

2. **Establish a Database Connection**: You should have already established a database connection as shown in the previous answer.

3. **Create an Insert SQL Query**: Define an SQL query to insert data into the database.

```java
String insertQuery = "INSERT INTO employees (first_name, last_name) VALUES (?, ?)";
```

4. **Prepare and Execute the SQL Statement**: Use a `PreparedStatement` to safely insert data into the database. This helps prevent SQL injection attacks and handles data types correctly.

```java
try {
    // ...

    // Create a PreparedStatement
    PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

    // Set values for the placeholders in the SQL query
    preparedStatement.setString(1, "John");
    preparedStatement.setString(2, "Doe");

    // Execute the INSERT statement
    int rowsInserted = preparedStatement.executeUpdate();

    if (rowsInserted > 0) {
        System.out.println("A new employee record was inserted successfully!");
    } else {
        System.out.println("Insertion failed.");
    }

    // Close the PreparedStatement
    preparedStatement.close();

    // ...
} catch (SQLException e) {
    e.printStackTrace();
}
```

In this example, we're inserting a new employee with the first name "John" and last name "Doe" into the "employees" table. You can replace these values with the actual data you want to insert.

5. **Close the Connection**: As always, remember to close the database connection and any related resources when you're done.

```java
try {
    // ...

    // Close the connection when done
    connection.close();
    System.out.println("Connection closed.");
} catch (SQLException e) {
    e.printStackTrace();
}
```

Make sure that your MySQL database is running and that you have the appropriate privileges to insert data into the "employees" table. Modify the table name and column names in the SQL query according to your actual database schema.

This example demonstrates how to insert a single record, but you can adapt it to insert multiple records or more complex data as needed.

