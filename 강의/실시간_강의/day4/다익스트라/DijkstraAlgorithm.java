package 실시간_강의.day4.다익스트라;

import java.util.Arrays;

public class DijkstraAlgorithm {
    private static int[][] graph = {
            {0, 7, 9, 0, 0, 14},
            {7, 0, 10, 15, 0, 0},
            {9, 10, 0, 11, 0, 2},
            {0, 15, 11, 0, 6, 0},
            {0, 0, 0, 6, 0, 9},
            {14, 0, 2, 0, 9, 0}
    };

    private static int startNod = 0;


    public static int[] dijkstra() {
        int n = graph.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[startNod] = 0;

        for (int i = 0; i < n; i++) {
            int minNode = getMinNode(dist, visited);
            visited[minNode] = true;

            for (int j = 0; j < n; j++) {
                if (!visited[j] && graph[minNode][j] != 0 &&
                        dist[minNode] != Integer.MAX_VALUE &&
                        dist[minNode] + graph[minNode][j] < dist[j]) {
                    dist[j] = dist[minNode] + graph[minNode][j];
                }
            }
        }
        return dist;

    }


    private static int getMinNode(int[] dist, boolean[] visited) {
        int minDist = Integer.MAX_VALUE;
        int minNode = -1;

        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] < minDist) {
                minDist = dist[i];
                minNode = i;
            }
        }
        return minNode;

    }

    private static void printResult(int[] dist) {
        System.out.println("Vertex Distance from start Node");
        for (int i = 0; i < dist.length; i++) {
            System.out.println(i + "        " + dist[i]);
        }
    }


    public static void main(String[] args) {
        int[] dist = dijkstra();
        printResult(dist);
    }
}
