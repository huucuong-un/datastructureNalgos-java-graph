/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph.dijkstra;
import java.util.Arrays;
import java.util.List;
/**A
 *
 * @author Admin
 */
public class MainApp {
       
    public static void main(String[] args) {

        
        //input is adjaceny List
        Node<String> nodeA = new Node<>("A");
        Node<String> nodeB = new Node<>("B");
        Node<String> nodeC = new Node<>("C");
        Node<String> nodeD = new Node<>("D");
        Node<String> nodeE = new Node<>("E");
        Node<String> nodeF = new Node<>("F");

          nodeA.addAdjacentNode(nodeB, 2);
        nodeA.addAdjacentNode(nodeC, 4);

        nodeB.addAdjacentNode(nodeC, 3);
        nodeB.addAdjacentNode(nodeD, 1);
        nodeB.addAdjacentNode(nodeE, 5);

        nodeC.addAdjacentNode(nodeD, 2);

        nodeD.addAdjacentNode(nodeE, 1);
        nodeD.addAdjacentNode(nodeF, 4);

        nodeE.addAdjacentNode(nodeF, 2);
        Dijkstra<String> dijkstra = new Dijkstra<>();
        dijkstra.calculateShortestPath(nodeA);
        
        List<Node<String>> graph = Arrays.asList(nodeA, nodeB, nodeC, nodeD, nodeE, nodeF);
        System.out.println("Min path by Dijkstra Algorithm: ");
        dijkstra.printPaths(graph);
    }
}
