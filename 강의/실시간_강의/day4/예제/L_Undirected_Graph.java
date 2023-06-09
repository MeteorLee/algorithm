package 실시간_강의.day4.예제;

import java.util.ArrayList;
import java.util.List;

public class L_Undirected_Graph {
  private int V;
  private List<List<Integer>> adj;

  public L_Undirected_Graph(int V) {
    this.V = V;
    adj = new ArrayList<>(V);

    for (int i = 0; i < V; i++)
      adj.add(new ArrayList<>());
  }

  public void addEdge(int u, int v) {
    adj.get(u).add(v);
    adj.get(v).add(u);
  }

  public void printGraph() {
    for (int i = 0; i < V; i++) {
      System.out.println("Adjacency list of vertex " + i);
      System.out.print("head");
      for (Integer pCrawl : adj.get(i)) {
        System.out.print(" -> " + pCrawl);
      }
      System.out.println("\n");
    }
  }

  public static void main(String args[]) {
    L_Undirected_Graph g = new L_Undirected_Graph(5);
    g.addEdge(0, 1);
    g.addEdge(0, 4);
    g.addEdge(1, 2);
    g.addEdge(1, 3);
    g.addEdge(1, 4);
    g.addEdge(2, 3);
    g.addEdge(3, 4);

    g.printGraph();
  }
}
