<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="com.sdcs.model.Vehicle" %>

<html>
<head><title>Vehicles</title></head>
<body>

<h2>All Vehicles</h2>

<table border="1" cellpadding="10">
    <tr>
        <th>ID</th>
        <th>Vehicle Number</th>
        <th>Model</th>
        <th>Status</th>
        <th>Latitude</th>
        <th>Longitude</th>
    </tr>

<%
    List<Vehicle> list = (List<Vehicle>) request.getAttribute("vehicles");
    if (list != null) {
        for (Vehicle v : list) {
%>

<tr>
    <td><%= v.id %></td>
    <td><%= v.vehicle_number %></td>
    <td><%= v.model %></td>
    <td><%= v.status %></td>
    <td><%= v.current_lat %></td>
    <td><%= v.current_lng %></td>
</tr>

<%
        }
    }
%>

</table>

<br><br>
<a href="admin">Back</a>

</body>
</html>
