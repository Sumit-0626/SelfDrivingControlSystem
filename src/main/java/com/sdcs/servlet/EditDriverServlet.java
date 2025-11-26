package com.sdcs.servlet;

import com.sdcs.auth.PasswordUtil;
import com.sdcs.db.DBHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet("/editDriver")
public class EditDriverServlet extends HttpServlet {

    // GET -> show edit page (not implemented UI here)
    // POST -> update username or password

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String idStr = req.getParameter("id");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (idStr == null) {
            resp.sendRedirect(req.getContextPath() + "/drivers");
            return;
        }

        int id = Integer.parseInt(idStr);

        try (Connection c = DBHelper.getConnection()) {
            if (password != null && !password.trim().isEmpty()) {
                String hashed = PasswordUtil.hash(password);
                try (PreparedStatement p = c.prepareStatement("UPDATE users SET username=?, password=? WHERE id=?")) {
                    p.setString(1, username);
                    p.setString(2, hashed);
                    p.setInt(3, id);
                    p.executeUpdate();
                }
            } else {
                try (PreparedStatement p = c.prepareStatement("UPDATE users SET username=? WHERE id=?")) {
                    p.setString(1, username);
                    p.setInt(2, id);
                    p.executeUpdate();
                }
            }
            resp.sendRedirect(req.getContextPath() + "/drivers");
        } catch (Exception e) {
            e.printStackTrace();
            resp.sendRedirect(req.getContextPath() + "/drivers");
        }
    }
}
