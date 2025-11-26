package com.sdcs.service;

import java.util.*;

public class DijkstraService {

    // Graph adjacency list
    private static final Map<Integer, List<Node>> graph = new HashMap<>();

    static {
        // Example graph (You can load from DB later)
        addEdge(1, 2, 5);
        addEdge(2, 3, 4);
        addEdge(1, 3, 12);
    }

    private static void addEdge(int u, int v, int w) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(new Node(v, w));
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(new Node(u, w)); // undirected
    }

    public static int calculateShortestPath(int start, int end) {

        Map<Integer, Integer> dist = new HashMap<>();
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.weight));

        for (int key : graph.keySet()) dist.put(key, Integer.MAX_VALUE);
        dist.put(start, 0);

        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node curr = pq.poll();

            if (curr.vertex == end)
                return curr.weight;

            for (Node next : graph.get(curr.vertex)) {
                int newDist = curr.weight + next.weight;

                if (newDist < dist.get(next.vertex)) {
                    dist.put(next.vertex, newDist);
                    pq.add(new Node(next.vertex, newDist));
                }
            }
        }

        return -1; // not reachable
    }

    static class Node {
        int vertex;
        int weight;

        Node(int v, int w) {
            vertex = v;
            weight = w;
        }
    }
}
