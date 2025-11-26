package com.sdcs.service;

import com.sdcs.algo.Dijkstra;
import com.sdcs.algo.Dijkstra.Edge;
import com.sdcs.db.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public  class RouteService {

    public static Map<Integer, List<Edge>> buildGraphFromDB() {
        Map<Integer, List<Edge>> graph = new HashMap<>();

        String sql = "SELECT start_point, end_point, distance_km FROM routes";

        try (Connection c = DBHelper.getConnection();
             PreparedStatement ps = c.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                int a = rs.getInt("start_point");
                int b = rs.getInt("end_point");
                double w = rs.getDouble("distance_km");

                graph.computeIfAbsent(a, k -> new ArrayList<>()).add(new Edge(b, w));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return graph;
    }

    public static Dijkstra.Result plan(int start, int end) {
        Map<Integer, List<Edge>> graph = buildGraphFromDB();
        return Dijkstra.shortestPath(graph, start, end);
    }
}

