import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.*;

public class TestPad {

  public static void main(String[] args) {
  /*
    Now for a DFS we require the following
    1. Mapping  --- HashMap
    2. Where to search? (Stack)
    3. Visited  --- HashSet
  */

    Graph walkingGraph = new Graph();
    Node start = new Node(1);
    Node end = new Node(4);

    HashMap<Node, Node> parent = new HashMap<Node, Node>();
    Deque<Node> search = new ArrayDeque<Node>();
    Set<Node> visited = new HashSet<Node>();

    visited.add(start);
    search.addFirst(start);

    while (search.peekFirst() != null) {
      Node temp = search.pollFirst();
      visited.add(temp);
      System.out.println("The temp is" + temp);
      if (temp.equals(end)) {
        System.out.println("Found it");
        displayPath(parent, start, end);
        break;
      }

      ArrayList<Node> tempNeighbors = walkingGraph.getNeighBors(temp);
      if (tempNeighbors != null) {

      for (Node tempNode : tempNeighbors) {
        if (!visited.contains(tempNode)) {
          parent.put(tempNode, temp);
          search.addFirst(tempNode);
        }
      }


      }


    }

  }


  public static void displayPath(HashMap<Node, Node> parent, Node start, Node end) {

    Deque<Node> displayStack = new ArrayDeque<Node>();

    Node temp = end;
    displayStack.addFirst(temp);
    while (temp != start) {
      temp = parent.get(temp);
      displayStack.addFirst(temp);

    }

    System.out.println("The route is ");
    while (displayStack.peekFirst() != null) {
      System.out.print(displayStack.removeFirst() + "->");
    }
    System.out.println("\n\n");
  }
}


class Graph {

  public HashMap<Node, ArrayList<Node>> givenGraph;
  public Graph() {
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node node5 = new Node(5);

    givenGraph = new HashMap<Node, ArrayList<Node>>();
    ArrayList<Node> node1NeighBors = new ArrayList<Node>();
    node1NeighBors.add(node2);
    givenGraph.put(node1, node1NeighBors);
    ArrayList<Node> node2NeighBors= new ArrayList<Node>();
    node2NeighBors.add(node3);
    node2NeighBors.add(node5);
    node2NeighBors.add(node4);
    givenGraph.put(node2, node2NeighBors);
    ArrayList<Node> node3NeighBors = new ArrayList<Node>();
    node3NeighBors.add(node4);
    givenGraph.put(node3, node3NeighBors);


  }

  public ArrayList<Node> getNeighBors(Node node) {
    if (givenGraph.get(node) != null) {
      ArrayList<Node> myCopy = new ArrayList<Node>(givenGraph.get(node));
       return myCopy;
    }

    return null;
  }

  public int getNeighBorsCount(Node node) {
    if (givenGraph.get(node) != null) {
      ArrayList<Node> myCopy = new ArrayList<Node>(givenGraph.get(node));
       return myCopy.size();
    }

    return 0;
  }

}

class Node {
  int index;

  public Node(int index) {
    this.index = index;
  }

  public int getIndex() {
    return this.index;
  }

  @Override
  public String toString() {
    return String.valueOf(index);
  }

  @Override 
  public int hashCode() {
    return index;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Node) {
      Node objTemp = (Node)obj;
      return objTemp.getIndex() == this.getIndex();
    }
    return false;
  }
}
