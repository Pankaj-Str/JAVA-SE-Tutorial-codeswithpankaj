# **Select Data from MySQL and Display in Console**

This guide builds on the previous INSERT example. We'll **SELECT** data from the `users` table and **display it in the console**.

## **Prerequisites**
- Same as INSERT example: MySQL running, database `testdb`, table `users` with some data.
- MySQL JDBC Driver in classpath.
- Some sample data already inserted (from previous example).

---

## **Step 1: Import Necessary Packages**
Add `ResultSet` to the imports:
```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;  // NEW: For reading query results
import java.sql.SQLException;
```

---

## **Step 2: Establish Database Connection**
**Same as INSERT example**:
```java
String url = "jdbc:mysql://localhost:3306/testdb";
String username = "root";
String password = "your_password";

Connection connection = null;
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    connection = DriverManager.getConnection(url, username, password);
    System.out.println("Connection established!");
} catch (ClassNotFoundException | SQLException e) {
    e.printStackTrace();
}
```

---

## **Step 3: Prepare the SELECT Statement**
Use `PreparedStatement` with `executeQuery()` (returns `ResultSet`):
```java
String sql = "SELECT id, name, email FROM users";  // Simple SELECT
PreparedStatement preparedStatement = null;
ResultSet resultSet = null;

try {
    preparedStatement = connection.prepareStatement(sql);
    resultSet = preparedStatement.executeQuery();  // Returns ResultSet
} catch (SQLException e) {
    e.printStackTrace();
}
```

**Alternative SELECT queries you can use:**
```java
// Select specific columns
String sql1 = "SELECT name, email FROM users";

// Select with WHERE condition
String sql2 = "SELECT * FROM users WHERE id = ?";

// Select with ORDER BY
String sql3 = "SELECT * FROM users ORDER BY name";
```

---

## **Step 4: Read and Display Data from ResultSet**
**Loop through ResultSet and print each row**:
```java
try {
    // Print header
    System.out.println("\n=== USERS DATA ===");
    System.out.printf("%-5s | %-15s | %-25s%n", "ID", "NAME", "EMAIL");
    System.out.println("------------------------------------------");

    // Loop through all rows
    while (resultSet.next()) {
        int id = resultSet.getInt("id");           // Get by column name
        String name = resultSet.getString("name");
        String email = resultSet.getString("email");
        
        // Format and print each row
        System.out.printf("%-5d | %-15s | %-25s%n", id, name, email);
    }
    
    System.out.println("=== END OF DATA ===\n");
    
} catch (SQLException e) {
    e.printStackTrace();
}
```

**Output Example:**
```
=== USERS DATA ===
ID    | NAME            | EMAIL                     
------------------------------------------
1     | John Doe        | john@example.com          
2     | Jane Smith      | jane@example.com          
3     | Alice Johnson   | alice@example.com         
=== END OF DATA ===
```

---

## **Step 5: Close Resources**
**Same as INSERT example**:
```java
finally {
    try {
        if (resultSet != null) resultSet.close();
        if (preparedStatement != null) preparedStatement.close();
        if (connection != null) connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
```

---

## **COMPLETE WORKING EXAMPLE**
```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDataExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "your_password";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Step 1: Connect
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database!");

            // Step 2: Prepare SELECT query
            String sql = "SELECT id, name, email FROM users ORDER BY id";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            // Step 3: Display data
            System.out.println("\n=== USERS DATA ===");
            System.out.printf("%-5s | %-15s | %-25s%n", "ID", "NAME", "EMAIL");
            System.out.println("------------------------------------------");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                
                System.out.printf("%-5d | %-15s | %-25s%n", id, name, email);
            }
            
            System.out.println("=== END OF DATA ===\n");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Step 4: Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
```

---

## **Step 6: Advanced Examples**

### **A. Select with WHERE Condition**
```java
String sql = "SELECT * FROM users WHERE name = ?";
preparedStatement.setString(1, "John Doe");
resultSet = preparedStatement.executeQuery();

// Display only matching record
while (resultSet.next()) {
    System.out.println("Found: " + resultSet.getString("name"));
}
```

### **B. Select Specific Range**
```java
String sql = "SELECT * FROM users LIMIT 2 OFFSET 1";  // Skip 1, take 2
```

### **C. Count Total Records**
```java
String countSql = "SELECT COUNT(*) as total FROM users";
resultSet = preparedStatement.executeQuery();
if (resultSet.next()) {
    int total = resultSet.getInt("total");
    System.out.println("Total users: " + total);
}
```

---

## **Step 7: Run and Test**
1. **Compile**: `javac SelectDataExample.java`
2. **Run**: `java -cp .:mysql-connector-java-8.0.x.jar SelectDataExample`
3. **Verify**: Console shows formatted table data.

---

## **Common Issues & Solutions**
| **Issue** | **Solution** |
|-----------|--------------|
| `ResultSet empty` | No data in table - run INSERT first |
| `Column not found` | Check exact column names in MySQL |
| `NullPointerException` | Always check `resultSet.next()` |
| `SQLException` | Verify table exists, connection details |

---

## **Pro Tips**
- **Use `getInt()`, `getString()`, `getDouble()`** based on column type
- **Access by index**: `resultSet.getString(1)` (1st column) - faster but error-prone
- **Try-with-resources** (Java 7+): Auto-closes resources
```java
try (Connection conn = DriverManager.getConnection(url, username, password);
     PreparedStatement pstmt = conn.prepareStatement(sql);
     ResultSet rs = pstmt.executeQuery()) {
    // Your code here
}  // Auto-closes all!
```

**Now run the code and see your data beautifully formatted in the console!** 🎉
