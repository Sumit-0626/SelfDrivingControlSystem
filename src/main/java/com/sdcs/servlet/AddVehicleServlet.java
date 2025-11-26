package com.sdcs.servlet;

import com.sdcs.db.DBHelper;
import com.sdcs.model.Vehicle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet("/addVehicle")
public class AddVehicleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/addVehicle.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String status = req.getParameter("status");
        double lat = 0, lon = 0;
        try {
            lat = Double.parseDouble(req.getParameter("lat"));
            lon = Double.parseDouble(req.getParameter("lon"));
        } catch (Exception ignored) {}

        try (Connection c = DBHelper.getConnection();
             PreparedStatement p = c.prepareStatement(
                     "INSERT INTO vehicles(name,status,lat,lon) VALUES(?,?,?,?)")) {
            p.setString(1, name);
            p.setString(2, status);
            p.setDouble(3, lat);
            p.setDouble(4, lon);
            p.executeUpdate();
            resp.sendRedirect(req.getContextPath() + "/vehicles");
        } catch (Exception e) {
            e.printStackTrace();
            req.setAttribute("error","Error adding vehicle.");
            req.getRequestDispatcher("/addVehicle.jsp").forward(req, resp);
        }
    }
}
