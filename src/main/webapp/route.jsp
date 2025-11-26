<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Route Planner</title></head>
<body>

<h2>Route Planner</h2>

<form method="post" action="planRoute">
    <input type="text" name="start" placeholder="Start Node ID" required /><br><br>
    <input type="text" name="end" placeholder="End Node ID" required /><br><br>

    <button type="submit">Find Route</button>
</form>

<div style="color:red;">
    ${error}
</div>

<br><br>
<a href="admin">Back</a>

</body>
</html>
