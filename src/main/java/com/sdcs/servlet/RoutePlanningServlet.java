package com.sdcs.servlet;

import com.sdcs.service.DijkstraService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/planRoute")
public class RoutePlanningServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String startStr = req.getParameter("start");
        String endStr = req.getParameter("end");

        try {
            int start = Integer.parseInt(startStr);
            int end = Integer.parseInt(endStr);

            int shortest = DijkstraService.calculateShortestPath(start, end);

            req.setAttribute("start", start);
            req.setAttribute("end", end);
            req.setAttribute("distance", shortest);
            req.getRequestDispatcher("/routeResult.jsp").forward(req, resp);

        } catch (Exception e) {
            req.setAttribute("error", "Invalid nodes.");
            req.getRequestDispatcher("/route.jsp").forward(req, resp);
        }
    }
}
