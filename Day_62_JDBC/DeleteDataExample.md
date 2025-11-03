# **Delete Record from MySQL**

This guide shows how to **delete a record** from the `users` table using **JDBC in Core Java**, with **safe and clean code**.

---

## **Prerequisites**
- MySQL running
- Database: `testdb`
- Table: `users` with some data (from previous INSERT/SELECT examples)
- MySQL JDBC Driver (`mysql-connector-java-x.x.xx.jar`) in classpath

---

## **Step 1: Import Required Packages**
```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
```

---

## **Step 2: Connect to Database**
```java
String url = "jdbc:mysql://localhost:3306/testdb";
String username = "root";
String password = "your_password";

Connection connection = null;
PreparedStatement preparedStatement = null;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    connection = DriverManager.getConnection(url, username, password);
    System.out.println("Connected to database!");
} catch (Exception e) {
    e.printStackTrace();
}
```

---

## **Step 3: Prepare DELETE Statement (Safe with `?`)**
Use `PreparedStatement` to avoid **SQL injection**.

```java
String sql = "DELETE FROM users WHERE id = ?";  // Delete by ID
// OR: "DELETE FROM users WHERE email = ?"
// OR: "DELETE FROM users WHERE name = ? AND email = ?"
```

---

## **Step 4: Set Parameter & Execute Delete**
```java
try {
    preparedStatement = connection.prepareStatement(sql);
    
    // Set the ID of the record to delete
    int idToDelete = 3;  // Change this to the ID you want to delete
    preparedStatement.setInt(1, idToDelete);

    // Execute the delete
    int rowsDeleted = preparedStatement.executeUpdate();

    if (rowsDeleted > 0) {
        System.out.println("Success: " + rowsDeleted + " record(s) deleted with ID = " + idToDelete);
    } else {
        System.out.println("No record found with ID = " + idToDelete);
    }

} catch (SQLException e) {
    System.out.println("Error deleting record:");
    e.printStackTrace();
}
```

---

## **Step 5: Close Resources**
```java
finally {
    try {
        if (preparedStatement != null) preparedStatement.close();
        if (connection != null) connection.close();
        System.out.println("Connection closed.");
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
```

---

## **FULL WORKING EXAMPLE: DeleteDataExample.java**

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDataExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "your_password";  // Change this!

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Step 1: Load driver & connect
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database!");

            // Step 2: Prepare DELETE query
            String sql = "DELETE FROM users WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);

            // Step 3: Set ID to delete
            int idToDelete = 3;  // Change this ID
            preparedStatement.setInt(1, idToDelete);

            // Step 4: Execute delete
            int rowsDeleted = preparedStatement.executeUpdate();

            // Step 5: Show result
            if (rowsDeleted > 0) {
                System.out.println("Success: Record with ID " + idToDelete + " deleted.");
            } else {
                System.out.println("Warning: No record found with ID " + idToDelete);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Error:");
            e.printStackTrace();
        } finally {
            // Step 6: Close resources
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
                System.out.println("Resources closed.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
```

---

## **Sample Output**
```
Connected to database!
Success: Record with ID 3 deleted.
Resources closed.
```

> After running, check in MySQL:
```sql
SELECT * FROM users;
```
→ Record with `id=3` should be **gone**.

---

## **Advanced: Delete Multiple Records**

### **Option 1: Delete by Condition**
```java
String sql = "DELETE FROM users WHERE email LIKE ?";
preparedStatement.setString(1, "%@example.com");
```

### **Option 2: Delete All Records (Be Careful!)**
```java
String sql = "DELETE FROM users";  // Deletes ALL rows
// OR: TRUNCATE TABLE users (faster, resets auto-increment)
```

---

## **Best Practice: Use `try-with-resources` (Java 7+)**
Auto-closes connection and statement:

```java
String sql = "DELETE FROM users WHERE id = ?";

try (Connection conn = DriverManager.getConnection(url, username, password);
     PreparedStatement pstmt = conn.prepareStatement(sql)) {

    pstmt.setInt(1, 3);
    int deleted = pstmt.executeUpdate();
    System.out.println("Deleted: " + deleted);

} catch (SQLException e) {
    e.printStackTrace();
}
```

---

## **Common Errors & Fixes**

| Error | Cause | Fix |
|------|------|-----|
| `No rows affected` | Wrong ID or no match | Check ID exists with `SELECT` first |
| `Table doesn't exist` | Wrong DB/table name | Verify with `SHOW TABLES;` |
| `Access denied` | Wrong password | Reset MySQL root password |
| `Driver not found` | JAR missing | Add `mysql-connector-java-x.jar` to classpath |

---

## **Verify Deletion in MySQL**
```sql
-- Before delete
SELECT * FROM users;

-- After delete
SELECT * FROM users;
```

---

