# **Update Record in MySQL using Core Java – Step by Step**

This guide shows how to **UPDATE** a record in the `users` table using **JDBC in Core Java**, safely and cleanly.

---

## **Prerequisites**
- MySQL running
- Database: `testdb`
- Table: `users` with data (from previous INSERT/SELECT/DELETE)
- MySQL JDBC Driver in classpath

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

## **Step 3: Prepare UPDATE Statement**
Use `PreparedStatement` with `?` placeholders to prevent **SQL injection**.

```java
String sql = "UPDATE users SET name = ?, email = ? WHERE id = ?";
```

> **Common UPDATE patterns:**
> ```java
> // Update single field
> "UPDATE users SET email = ? WHERE id = ?"
> 
> // Update multiple fields
> "UPDATE users SET name = ?, email = ? WHERE email = ?"
> 
> // Update all records (use carefully!)
> "UPDATE users SET status = 'active'"
> ```

---

## **Step 4: Set Values & Execute Update**
```java
try {
    preparedStatement = connection.prepareStatement(sql);

    // Set new values
    preparedStatement.setString(1, "John Updated");     // new name
    preparedStatement.setString(2, "john.new@example.com"); // new email
    preparedStatement.setInt(3, 1);                     // ID to update

    // Execute update
    int rowsUpdated = preparedStatement.executeUpdate();

    if (rowsUpdated > 0) {
        System.out.println("Success: " + rowsUpdated + " record(s) updated!");
    } else {
        System.out.println("Warning: No record found with ID = 1");
    }

} catch (SQLException e) {
    System.out.println("Error updating record:");
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

## **FULL WORKING EXAMPLE: UpdateDataExample.java**

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDataExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "your_password";  // Change this!

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Step 1: Connect
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database!");

            // Step 2: Prepare UPDATE query
            String sql = "UPDATE users SET name = ?, email = ? WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);

            // Step 3: Set parameters
            preparedStatement.setString(1, "Johnathan Doe");           // new name
            preparedStatement.setString(2, "john.doe@updated.com");    // new email
            preparedStatement.setInt(3, 1);                            // target ID

            // Step 4: Execute update
            int rowsUpdated = preparedStatement.executeUpdate();

            // Step 5: Show result
            if (rowsUpdated > 0) {
                System.out.println("Success: Record with ID 1 updated successfully!");
            } else {
                System.out.println("Warning: No record found with ID 1");
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
Success: Record with ID 1 updated successfully!
Resources closed.
```

> **Verify in MySQL:**
```sql
SELECT * FROM users WHERE id = 1;
```
→ Should show updated `name` and `email`.

---

## **Advanced Examples**

### **1. Update Only One Field**
```java
String sql = "UPDATE users SET email = ? WHERE id = ?";
preparedStatement.setString(1, "newemail@example.com");
preparedStatement.setInt(2, 2);
```

### **2. Update Using Email (Not ID)**
```java
String sql = "UPDATE users SET name = ? WHERE email = ?";
preparedStatement.setString(1, "Admin User");
preparedStatement.setString(2, "admin@example.com");
```

### **3. Update Multiple Records**
```java
String sql = "UPDATE users SET status = ? WHERE email LIKE ?";
preparedStatement.setString(1, "inactive");
preparedStatement.setString(2, "%@example.com");
```

---

## **Best Practice: `try-with-resources` (Recommended)**

```java
String sql = "UPDATE users SET name = ?, email = ? WHERE id = ?";

try (Connection conn = DriverManager.getConnection(url, username, password);
     PreparedStatement pstmt = conn.prepareStatement(sql)) {

    pstmt.setString(1, "Jane Smith Updated");
    pstmt.setString(2, "jane.updated@example.com");
    pstmt.setInt(3, 2);

    int updated = pstmt.executeUpdate();
    System.out.println("Updated: " + updated + " row(s)");

} catch (SQLException e) {
    e.printStackTrace();
}
```

---

## **Common Errors & Fixes**

| Error | Cause | Fix |
|------|------|-----|
| `0 rows updated` | Wrong `WHERE` condition | Check ID/email exists |
| `Column not found` | Typo in column name | Use exact names from table |
| `Data truncation` | Value too long for column | Check `VARCHAR` length |
| `Duplicate entry` | Violates UNIQUE constraint | Handle or check first |

---

## **Verify Update in MySQL**
```sql
-- Before
SELECT * FROM users WHERE id = 1;

-- After running Java code
SELECT * FROM users WHERE id = 1;
```

---

## **Summary of CRUD Operations (Now Complete!)**

| Operation | SQL | Java Method |
|---------|-----|-------------|
| **C**reate | `INSERT` | `executeUpdate()` |
| **R**ead   | `SELECT` | `executeQuery()` → `ResultSet` |
| **U**pdate | `UPDATE` | `executeUpdate()` |
| **D**elete | `DELETE` | `executeUpdate()` |

---

