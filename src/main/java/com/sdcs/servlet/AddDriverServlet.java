package com.sdcs.servlet;

import com.sdcs.auth.PasswordUtil;
import com.sdcs.db.DBHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet("/addDriver")
public class AddDriverServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/addDriver.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String role = "driver";

        String hashed = PasswordUtil.hash(password);

        try (Connection c = DBHelper.getConnection();
             PreparedStatement p = c.prepareStatement(
                     "INSERT INTO users(username,password,role) VALUES(?,?,?)")) {
            p.setString(1, username);
            p.setString(2, hashed);
            p.setString(3, role);
            p.executeUpdate();

            resp.sendRedirect(req.getContextPath() + "/admin.jsp");
        } catch (Exception ex) {
            ex.printStackTrace();
            req.setAttribute("error", "Error adding driver.");
            req.getRequestDispatcher("/addDriver.jsp").forward(req, resp);
        }
    }
}
