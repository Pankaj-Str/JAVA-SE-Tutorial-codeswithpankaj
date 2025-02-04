**Intermediate Level: Forms, Sessions, and Cookies (26–50)**

---

31. **Create a Servlet that accepts a user’s first and last name and displays a full name.**
    ```java
    import java.io.*;
    import javax.servlet.*;
    import javax.servlet.http.*;

    public class FullNameServlet extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<p>Full Name: " + firstName + " " + lastName + "</p>");
        }
    }
    ```

32. **Write a JSP program to store user login information in a session.**
    ```jsp
    <%
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if ("admin".equals(username) && "admin123".equals(password)) {
            session.setAttribute("username", username);
            out.println("Login Successful!");
        } else {
            out.println("Invalid Credentials!");
        }
    %>
    ```

33. **Demonstrate the use of the session implicit object to count the total number of user sessions.**
    ```jsp
    <%
        Integer sessionCount = (Integer) application.getAttribute("sessionCount");
        if (sessionCount == null) {
            sessionCount = 1;
        } else {
            sessionCount++;
        }
        application.setAttribute("sessionCount", sessionCount);
    %>
    <p>Total Sessions: <%= sessionCount %></p>
    ```

34. **Write a Servlet program to retrieve form data sent via POST method.**
    ```java
    import java.io.*;
    import javax.servlet.*;
    import javax.servlet.http.*;

    public class PostServlet extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String name = request.getParameter("name");
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<p>Hello, " + name + "!</p>");
        }
    }
    ```

35. **Create a JSP page that uses hidden fields to transfer data between pages.**
    ```jsp
    <!-- page1.jsp -->
    <html>
    <body>
        <form action="page2.jsp" method="post">
            <input type="hidden" name="data" value="SecretData">
            <input type="submit" value="Go to Page 2">
        </form>
    </body>
    </html>

    <!-- page2.jsp -->
    <%
        String data = request.getParameter("data");
        out.println("Hidden Data: " + data);
    %>
    ```

36. **Write a JSP program that uses cookies to store a user’s preferred theme (light or dark mode).**
    ```jsp
    <%
        String theme = request.getParameter("theme");
        if (theme != null) {
            Cookie cookie = new Cookie("theme", theme);
            cookie.setMaxAge(60 * 60 * 24 * 30); // 30 days
            response.addCookie(cookie);
        }
    %>
    <html>
    <body>
        <form action="" method="post">
            <select name="theme">
                <option value="light">Light Mode</option>
                <option value="dark">Dark Mode</option>
            </select>
            <input type="submit" value="Save Theme">
        </form>
    </body>
    </html>
    ```

37. **Create a Servlet that forwards a request to another JSP page using `RequestDispatcher`.**
    ```java
    import java.io.*;
    import javax.servlet.*;
    import javax.servlet.http.*;

    public class ForwardServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            RequestDispatcher dispatcher = request.getRequestDispatcher("forward.jsp");
            dispatcher.forward(request, response);
        }
    }
    ```

38. **Demonstrate how to use URL rewriting for session tracking in Servlets.**
    ```java
    import java.io.*;
    import javax.servlet.*;
    import javax.servlet.http.*;

    public class URLRewriteServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String name = request.getParameter("name");
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<a href='nextPage.jsp;jsessionid=" + request.getSession().getId() + "'>Next Page</a>");
        }
    }
    ```

39. **Write a JSP program to validate form data (e.g., name, email) using JavaScript and JSP.**
    ```jsp
    <html>
    <head>
        <script>
            function validateForm() {
                var name = document.forms["myForm"]["name"].value;
                var email = document.forms["myForm"]["email"].value;
                if (name == "" || email == "") {
                    alert("Name and Email are required!");
                    return false;
                }
            }
        </script>
    </head>
    <body>
        <form name="myForm" action="validate.jsp" onsubmit="return validateForm()" method="post">
            Name: <input type="text" name="name"><br>
            Email: <input type="text" name="email"><br>
            <input type="submit" value="Submit">
        </form>
    </body>
    </html>
    ```

40. **Create a Servlet that retrieves a list of values sent from an HTML multiple select dropdown.**
    ```java
    import java.io.*;
    import javax.servlet.*;
    import javax.servlet.http.*;

    public class MultiSelectServlet extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String[] items = request.getParameterValues("items");
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<p>Selected Items:</p>");
            for (String item : items) {
                out.println("<p>" + item + "</p>");
            }
        }
    }
    ```

41. **Write a JSP program that demonstrates how to upload a file using a form.**
    ```jsp
    <html>
    <body>
        <form action="upload.jsp" method="post" enctype="multipart/form-data">
            <input type="file" name="file">
            <input type="submit" value="Upload">
        </form>
    </body>
    </html>
    ```
    **upload.jsp:**
    ```jsp
    <%
        Part filePart = request.getPart("file");
        String fileName = filePart.getSubmittedFileName();
        filePart.write("C:/uploads/" + fileName);
        out.println("File uploaded successfully!");
    %>
    ```

42. **Create a Servlet that generates a table of multiplication results for a given number.**
    ```java
    import java.io.*;
    import javax.servlet.*;
    import javax.servlet.http.*;

    public class MultiplicationServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            int num = Integer.parseInt(request.getParameter("num"));
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<table border='1'>");
            for (int i = 1; i <= 10; i++) {
                out.println("<tr><td>" + num + " x " + i + "</td><td>" + (num * i) + "</td></tr>");
            }
            out.println("</table>");
        }
    }
    ```

43. **Write a JSP program to display user information stored in a session object.**
    ```jsp
    <%
        String username = (String) session.getAttribute("username");
        if (username != null) {
            out.println("Welcome, " + username + "!");
        } else {
            out.println("Please log in.");
        }
    %>
    ```

44. **Create a Servlet that deletes cookies stored in a user's browser.**
    ```java
    import java.io.*;
    import javax.servlet.*;
    import javax.servlet.http.*;

    public class DeleteCookieServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                }
            }
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<p>Cookies deleted!</p>");
        }
    }
    ```

45. **Demonstrate how to invalidate a session using the `session.invalidate()` method in Servlets.**
    ```java
    import java.io.*;
    import javax.servlet.*;
    import javax.servlet.http.*;

    public class InvalidateSessionServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            HttpSession session = request.getSession();
            session.invalidate();
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<p>Session invalidated!</p>");
        }
    }
    ```

46. **Write a JSP program to display a user’s browser and operating system details.**
    ```jsp
    <%
        String browser = request.getHeader("User-Agent");
        out.println("<p>Browser: " + browser + "</p>");
    %>
    ```

47. **Create a JSP page that calculates and displays the sum of numbers from 1 to N.**
    ```jsp
    <%
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
    %>
    <p>Sum of numbers from 1 to <%= n %> is <%= sum %>.</p>
    ```

48. **Write a Servlet program that dynamically generates an HTML table with rows and columns.**
    ```java
    import java.io.*;
    import javax.servlet.*;
    import javax.servlet.http.*;

    public class TableServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<table border='1'>");
            for (int i = 1; i <= 5; i++) {
                out.println("<tr>");
                for (int j = 1; j <= 5; j++) {
                    out.println("<td>" + i + "," + j + "</td>");
                }
                out.println("</tr>");
            }
            out.println("</table>");
        }
    }
    ```

49. **Create a JSP page to display an error message when a user enters invalid login details.**
    ```jsp
    <%
        String error = request.getParameter("error");
        if (error != null) {
            out.println("<p style='color:red;'>Invalid login details!</p>");
        }
    %>
    ```

50. **Write a JSP program to implement a simple user registration form.**
    ```jsp
    <html>
    <body>
        <form action="register.jsp" method="post">
            Name: <input type="text" name="name"><br>
            Email: <input type="text" name="email"><br>
            Password: <input type="password" name="password"><br>
            <input type="submit" value="Register">
        </form>
    </body>
    </html>
    ```

---

