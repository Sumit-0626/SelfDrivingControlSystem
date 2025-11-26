package com.sdcs.servlet;

import com.sdcs.db.DBHelper;
import com.sdcs.model.Driver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/drivers")
public class DriverListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        List<Driver> drivers = new ArrayList<>();

        try (Connection c = DBHelper.getConnection();
             PreparedStatement p = c.prepareStatement(
                     "SELECT id, username, password FROM users WHERE role='driver'"
             )) {

            ResultSet r = p.executeQuery();

            while (r.next()) {
                Driver d = new Driver(
                        r.getInt("id"),
                        r.getString("username"),
                        r.getString("password")
                );

                drivers.add(d);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        req.setAttribute("drivers", drivers);
        req.getRequestDispatcher("/drivers.jsp").forward(req, resp);
    }
}
