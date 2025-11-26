package com.sdcs.servlet;

import com.sdcs.db.DBHelper;
import com.sdcs.model.Vehicle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/vehicles")
public class VehicleListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        List<Vehicle> list = new ArrayList<>();

        String sql = "SELECT id, vehicle_number, model, status, current_lat, current_lng FROM vehicles";

        try (Connection c = DBHelper.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Vehicle v = new Vehicle(
                        rs.getInt("id"),
                        rs.getString("vehicle_number"),
                        rs.getString("model"),
                        rs.getString("status"),
                        rs.getDouble("current_lat"),
                        rs.getDouble("current_lng")
                );
                list.add(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        req.setAttribute("vehicles", list);
        req.getRequestDispatcher("/vehicles.jsp").forward(req, resp);

    }
}
