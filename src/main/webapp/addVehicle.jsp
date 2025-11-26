<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Add Vehicle</title></head>
<body>

<h2>Add Vehicle</h2>

<form method="post" action="addVehicle">
    <input type="text" name="name" placeholder="Vehicle Name" required /><br><br>

    <select name="status">
        <option value="active">Active</option>
        <option value="idle">Idle</option>
        <option value="maintenance">Maintenance</option>
    </select><br><br>

    <input type="text" name="lat" placeholder="Latitude" /><br><br>
    <input type="text" name="lon" placeholder="Longitude" /><br><br>

    <button type="submit">Add Vehicle</button>
</form>

<div style="color:red;">
    ${error}
</div>

<br><br>
<a href="admin">Back</a>

</body>
</html>
