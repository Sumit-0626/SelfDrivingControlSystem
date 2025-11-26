package com.sdcs.servlet;

import com.sdcs.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
@WebServlet("/admin")
public class AdminServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession s = req.getSession(false);
        if (s == null) {
            resp.sendRedirect("login.jsp");
            return;
        }

        User u = (User) s.getAttribute("user");
        if (u == null || !"admin".equals(u.getRole())) {
            resp.sendRedirect("login.jsp");
            return;
        }

        req.getRequestDispatcher("admin.jsp").forward(req, resp);
    }
}
