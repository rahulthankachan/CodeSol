import java.util.*;

/// Implementation of the DFS algorithm 


public class TestPad {
  public static void main(String[] args) {

    Graph g = new Graph();
    // System.out.println(g.map.toString());
    bfs(g, 1, 4);


  }


  public static void bfs(Graph g, int start, int destination) {
    if (g == null) {
      System.out.println("The graph is null man!!");
    }

    Map<Integer, Integer> parent = new HashMap<Integer, Integer>();
    Set<Integer> visited = new HashSet<Integer>();
    Deque<Integer> q = new ArrayDeque<Integer>();

    q.addLast(start);

    while(!q.isEmpty()) {
      int current = q.removeFirst();
      processNodeEarly(current);
      if (current == destination) {
        System.out.println("We have found the destination");
        trace(current, start, parent);
        break;
      }

      ArrayList<Integer> neighBors = g.map.get(current);
      for (int n : neighBors) {
        if(!visited.contains(n)) {
          parent.put(n, current);
          q.addLast(n);
          visited.add(n);
        }
      }

    }


  }

  public static void processNodeEarly(int current) {
    System.out.println("The Algorithm just Visited " + current);
  }


  public static void trace(int currentNode, int startNode, Map<Integer, Integer> parent) {

    StringBuilder path = new StringBuilder();

    while(currentNode != startNode) {
      if (path.length() == 0) {
        path.insert(0, String.valueOf(currentNode));
      } else {
        path.insert(0, String.valueOf(currentNode) + "->");
      }

      currentNode = parent.get(currentNode);
    }

    path.insert(0, String.valueOf(currentNode) + "->");
    System.out.println("The path is \n\n" + path.toString());

  }

}


class Graph {
  Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

  public Graph() {

    ArrayList<Integer> n1 = new ArrayList<Integer>();
    n1.add(2);
    n1.add(5);
    n1.add(3);

    map.put(1, n1);

    ArrayList<Integer> n2 = new ArrayList<Integer>();
    n2.add(1);
    n2.add(3);

    map.put(2, n2);

    ArrayList<Integer> n3 = new ArrayList<Integer>();
    n3.add(2);
    n3.add(4);
    n3.add(1);

    map.put(3, n3);

    ArrayList<Integer> n4 = new ArrayList<Integer>();
    n4.add(3);

    map.put(4, n4);

    ArrayList<Integer> n5 = new ArrayList<Integer>();
    n5.add(1);
    map.put(5, n5);


  }
}


// class Node {
//   int val;
//   public Node (int val) {
//     this.val = val;
//   }
// }
