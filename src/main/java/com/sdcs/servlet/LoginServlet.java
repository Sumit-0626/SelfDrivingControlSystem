package com.sdcs.servlet;

import com.sdcs.auth.AuthService;
import com.sdcs.exception.InvalidLoginException;
import com.sdcs.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = null;

        try {
            user = AuthService.login(username, password);
        } catch (InvalidLoginException e) {
            resp.sendRedirect("login.jsp?error=1");
            return;
        }

        // save session
        HttpSession session = req.getSession();
        session.setAttribute("user", user);

        // role-based redirect
        String role = user.getRole();

        if ("admin".equals(role)) {
            resp.sendRedirect(req.getContextPath() + "/admin");
        } else if ("driver".equals(role)) {
            resp.sendRedirect(req.getContextPath() + "/drivers");
        } else if ("technician".equals(role)) {
            resp.sendRedirect(req.getContextPath() + "/technician");
        } else {
            resp.sendRedirect("login.jsp?error=2");
        }
    }
}
