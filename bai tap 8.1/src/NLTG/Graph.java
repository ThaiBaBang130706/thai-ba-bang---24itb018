package NLTG;

import java.util.*;

public class Graph {
    private Map<Integer, List<Node>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addEdge(int src, int dest , int weight) {
        adjList.putIfAbsent(src, new ArrayList<>());
        adjList.get(src).add(new Node(dest));
    }

    public void dijkstra(int start) {
        Map<Integer, Integer> distances = new HashMap<>();
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.value));

        for (int node : adjList.keySet()) {
            distances.put(node, Integer.MAX_VALUE);
        }
        distances.put(start, 0);
        pq.add(new Node(start));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int u = current.value;

            for (Node neighbor : adjList.getOrDefault(u, new ArrayList<>())) {
                int v = neighbor.value;
                int weight = neighbor.next.value;

                int newDist = distances.get(u) + weight;
                if (newDist < distances.get(v)) {
                    distances.put(v, newDist);
                    pq.add(new Node(v));
                }
            }
        }

        for (Map.Entry<Integer, Integer> entry : distances.entrySet()) {
            System.out.println("Distance from " + start + " to " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
