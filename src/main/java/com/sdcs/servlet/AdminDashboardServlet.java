package com.sdcs.servlet;

import com.sdcs.db.DBHelper;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

public class AdminDashboardServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        try (Connection con = DBHelper.getConnection()) {

            Statement st = con.createStatement();

            ResultSet rs1 = st.executeQuery("SELECT COUNT(*) FROM vehicles");
            rs1.next();
            req.setAttribute("totalVehicles", rs1.getInt(1));

            ResultSet rs2 = st.executeQuery(
                "SELECT COUNT(*) FROM vehicles WHERE status='ACTIVE'");
            rs2.next();
            req.setAttribute("activeVehicles", rs2.getInt(1));

            req.getRequestDispatcher("pages/adminDashboard.jsp")
               .forward(req, resp);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
