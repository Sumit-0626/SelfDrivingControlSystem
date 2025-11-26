package com.sdcs.servlet;

import com.sdcs.db.DBHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet("/deleteDriver")
public class DeleteDriverServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String idStr = req.getParameter("id");
        if (idStr == null) {
            resp.sendRedirect(req.getContextPath() + "/drivers");
            return;
        }

        int id = Integer.parseInt(idStr);
        try (Connection c = DBHelper.getConnection();
             PreparedStatement p = c.prepareStatement("DELETE FROM users WHERE id=?")) {
            p.setInt(1, id);
            p.executeUpdate();
        } catch (Exception e) { e.printStackTrace(); }

        resp.sendRedirect(req.getContextPath() + "/drivers");
    }
}
