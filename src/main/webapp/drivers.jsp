<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="com.sdcs.model.User" %>

<html>
<head>
    <title>Drivers</title>
</head>
<body>

<h2>All Drivers</h2>

<table border="1" cellpadding="10">
    <tr>
        <th>ID</th>
        <th>Username</th>
        <th>Action</th>
    </tr>

    <%
        List<User> list = (List<User>) request.getAttribute("drivers");
        if (list != null) {
            for (User u : list) {
    %>
    <tr>
        <td><%= u.getId() %></td>
        <td><%= u.getUsername() %></td>
        <td>
            <form method="post" action="deleteDriver" style="display:inline;">
                <input type="hidden" name="id" value="<%= u.getId() %>">
                <button type="submit">Delete</button>
            </form>
        </td>
    </tr>
    <%      }
        }
    %>
</table>

<br><br>
<a href="admin">Back</a>

</body>
</html>
