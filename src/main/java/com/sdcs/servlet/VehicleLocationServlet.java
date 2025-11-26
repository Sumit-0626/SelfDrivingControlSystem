package com.sdcs.servlet;

import com.sdcs.db.DBHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

@WebServlet("/vehicleLocation")
public class VehicleLocationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("application/json");
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        try (Connection c = DBHelper.getConnection();
             PreparedStatement p = c.prepareStatement("SELECT id,name,lat,lon FROM vehicles")) {
            ResultSet r = p.executeQuery();
            boolean first = true;
            while (r.next()) {
                if (!first) sb.append(",");
                first = false;
                sb.append("{");
                sb.append("\"id\":").append(r.getInt("id")).append(",");
                sb.append("\"name\":\"").append(r.getString("name")).append("\",");
                sb.append("\"lat\":").append(r.getDouble("lat")).append(",");
                sb.append("\"lon\":").append(r.getDouble("lon"));
                sb.append("}");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        sb.append("]");
        resp.getWriter().write(sb.toString());
    }
}
