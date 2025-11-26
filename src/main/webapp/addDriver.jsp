<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Add Driver</title></head>
<body>

<h2>Add New Driver</h2>

<form method="post" action="addDriver">
    <input type="text" name="username" placeholder="Username" required /><br><br>
    <input type="password" name="password" placeholder="Password" required /><br><br>
    <button type="submit">Add Driver</button>
</form>

<div style="color:red;">
    ${error}
</div>

<br><br>
<a href="admin">Back</a>

</body>
</html>
