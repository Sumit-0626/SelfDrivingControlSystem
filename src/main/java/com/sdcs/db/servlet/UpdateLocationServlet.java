package com.sdcs.servlet;

import com.sdcs.db.DBHelper;
import com.sdcs.util.ValidationUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateLocationServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String vehicleId = req.getParameter("vehicleId");
        String lat = req.getParameter("lat");
        String lng = req.getParameter("lng");

        // Server-side validation
        if (ValidationUtil.isEmpty(vehicleId) ||
            ValidationUtil.isEmpty(lat) ||
            ValidationUtil.isEmpty(lng)) {

            req.setAttribute("error", "All fields are required");
            req.getRequestDispatcher("pages/error.jsp").forward(req, resp);
            return;
        }

        try (Connection con = DBHelper.getConnection()) {

            String sql = "UPDATE vehicles SET current_lat=?, current_lng=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, lat);
            ps.setString(2, lng);
            ps.setInt(3, Integer.parseInt(vehicleId));
            ps.executeUpdate();

            resp.sendRedirect("pages/success.jsp");

        } catch (Exception e) {
            e.printStackTrace();
            req.setAttribute("error", "Server error occurred");
            req.getRequestDispatcher("pages/error.jsp").forward(req, resp);
        }
    }
}
