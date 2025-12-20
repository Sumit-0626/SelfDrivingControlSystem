<td>
<% if(vehicle.getStatus().equals("ACTIVE")) { %>
    <span style="color:green;">ACTIVE</span>
<% } else if(vehicle.getStatus().equals("MAINTENANCE")) { %>
    <span style="color:orange;">MAINTENANCE</span>
<% } else { %>
    <span style="color:red;">INACTIVE</span>
<% } %>
</td>
