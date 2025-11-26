package com.sdcs.algo;

import java.util.*;

public class Dijkstra {
    public static class Edge {
        public int to;
        public double weight;
        public Edge(int to, double weight) { this.to = to; this.weight = weight; }
    }

    public static class Result {
        public List<Integer> path;
        public double distance;
        public Result(List<Integer> path, double distance) { this.path = path; this.distance = distance; }
    }

    // graph: map node -> list edges
    public static Result shortestPath(Map<Integer, List<Edge>> graph, int start, int end) {
        Map<Integer, Double> dist = new HashMap<>();
        Map<Integer, Integer> prev = new HashMap<>();
        Comparator<int[]> cmp = Comparator.comparingDouble(a -> a[1]);
        PriorityQueue<int[]> pq = new PriorityQueue<>(cmp);

        dist.put(start, 0.0);
        pq.add(new int[]{start, 0});

        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int u = top[0];
            double dU = dist.getOrDefault(u, Double.POSITIVE_INFINITY);
            if (u == end) break;
            for (Edge e : graph.getOrDefault(u, Collections.emptyList())) {
                double alt = dU + e.weight;
                if (alt < dist.getOrDefault(e.to, Double.POSITIVE_INFINITY)) {
                    dist.put(e.to, alt);
                    prev.put(e.to, u);
                    pq.add(new int[]{e.to, (int) alt});
                }
            }
        }

        if (!dist.containsKey(end)) {
            return new Result(Collections.emptyList(), Double.POSITIVE_INFINITY);
        }

        List<Integer> path = new ArrayList<>();
        Integer cur = end;
        while (cur != null) {
            path.add(cur);
            if (cur.equals(start)) break;
            cur = prev.get(cur);
        }
        Collections.reverse(path);
        return new Result(path, dist.getOrDefault(end, Double.POSITIVE_INFINITY));
    }
}
