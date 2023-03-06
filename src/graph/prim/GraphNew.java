/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph.prim;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


/**
 *
 * @author Admin
 */
public class GraphNew {

    
    public static void main(String[] args) {
        Vertex<String> vertex0 = new Vertex<>("0");
        Vertex<String> vertex1 = new Vertex<>("1");
        Vertex<String> vertex2 = new Vertex<>("2");
        Vertex<String> vertex3 = new Vertex<>("3");
        Vertex<String> vertex4 = new Vertex<>("4");
        Vertex<String> vertex5 = new Vertex<>("5");
        Vertex<String> vertex6 = new Vertex<>("6");
        Vertex<String> vertex7 = new Vertex<>("7");
        Vertex<String> vertex8 = new Vertex<>("8");




       

        Edge edge01 = new Edge(4);
        Edge edge07 = new Edge(8);
        Edge edge12 = new Edge(8);
        Edge edge17 = new Edge(11);
        Edge edge23 = new Edge(7);
        Edge edge25 = new Edge(4);
        Edge edge28 = new Edge(2);
        Edge edge34 = new Edge(9);
        Edge edge35 = new Edge(14);
        Edge edge45 = new Edge(10);
        Edge edge56 = new Edge(2);
        Edge edge67 = new Edge(1);
        Edge edge68 = new Edge(6);
        Edge edge78 = new Edge(7);
        
        
        
        
        
        

        vertex0.addNeighbor(vertex1, edge01);        vertex0.addNeighbor(vertex7, edge07);

       

        vertex1.addNeighbor(vertex0, edge01);        vertex1.addNeighbor(vertex7, edge17);
        vertex1.addNeighbor(vertex2, edge12);        


        vertex2.addNeighbor(vertex1, edge12);        vertex2.addNeighbor(vertex5, edge25);       
        vertex2.addNeighbor(vertex3, edge23);        vertex2.addNeighbor(vertex8, edge28); 
  

        vertex3.addNeighbor(vertex2, edge23);        vertex3.addNeighbor(vertex5, edge35);  
        vertex3.addNeighbor(vertex4, edge34); 
        
        vertex4.addNeighbor(vertex3, edge34);        vertex4.addNeighbor(vertex5, edge45);   
        
        
        vertex5.addNeighbor(vertex2, edge25);        vertex5.addNeighbor(vertex4, edge45);
        vertex5.addNeighbor(vertex3, edge35);        vertex5.addNeighbor(vertex6, edge56);
        
        
        vertex6.addNeighbor(vertex5, edge56);        vertex6.addNeighbor(vertex8, edge68);
        vertex6.addNeighbor(vertex7, edge67);
        
        
        vertex7.addNeighbor(vertex0, edge07);        vertex7.addNeighbor(vertex6,  edge67);
        vertex7.addNeighbor(vertex1, edge17);        vertex7.addNeighbor(vertex8, edge78);
                 
        
        vertex8.addNeighbor(vertex2, edge28);        vertex8.addNeighbor(vertex6, edge68); 
        vertex8.addNeighbor(vertex7, edge78); 


        
        List<Vertex<String>> graph = Arrays.asList(vertex0, vertex1, vertex2, vertex3, vertex4, vertex5, vertex6, vertex7, vertex8);

        
        System.out.println("Find minimum spanning graph by Prim Algorithm: ");
        Prim prim = new Prim(graph);
        prim.run();

        Integer minimum = Stream.of(edge01, edge07, edge12, edge17, edge23, edge25, edge28, edge34, edge35, edge45, edge56, edge67, edge68, edge78)
                .filter(Edge::isIncluded).map(Edge::getWeight).reduce(0, Integer::sum);
        System.out.println("Minimum Weight: " + minimum);



//      Vertex<String> vertexA = new Vertex<>("A");
//        Vertex<String> vertexB = new Vertex<>("B");
//        Vertex<String> vertexC = new Vertex<>("C");
//        Vertex<String> vertexD = new Vertex<>("D");
//        Vertex<String> vertexE = new Vertex<>("E");
//        Vertex<String> vertexF = new Vertex<>("F");
//        Vertex<String> vertexG = new Vertex<>("G");
//
//        List<Edge<String>> graph1 = Arrays.asList(
//                new Edge<>(vertexA, vertexB, 4),
//                new Edge<>(vertexA, vertexC, 4),
//                new Edge<>(vertexB, vertexC, 2),
//                new Edge<>(vertexC, vertexD, 3),
//                new Edge<>(vertexC, vertexF, 4),
//                new Edge<>(vertexC, vertexE, 2),
//                new Edge<>(vertexD, vertexF, 3),
//                new Edge<>(vertexE, vertexF, 3)
//        );
//
//        List<Edge<String>> graph2 = Arrays.asList(
//                new Edge<>(vertexA, vertexB, 7),
//                new Edge<>(vertexA, vertexD, 5),
//                new Edge<>(vertexB, vertexC, 8),
//                new Edge<>(vertexB, vertexE, 7),
//                new Edge<>(vertexB, vertexD, 9),
//                new Edge<>(vertexC, vertexE, 5),
//                new Edge<>(vertexD, vertexE, 15),
//                new Edge<>(vertexD, vertexF, 6),
//                new Edge<>(vertexE, vertexF, 8),
//                new Edge<>(vertexE, vertexG, 9),
//                new Edge<>(vertexF, vertexG, 11)
//        );
//
//        List<Edge<String>> graph3 = Arrays.asList(
//                new Edge<>(vertexA, vertexB, 5),
//                new Edge<>(vertexA, vertexC, 2),
//                new Edge<>(vertexB, vertexC, 3),
//                new Edge<>(vertexB, vertexD, 8),
//                new Edge<>(vertexB, vertexE, 7),
//                new Edge<>(vertexD, vertexE, 6),
//                new Edge<>(vertexC, vertexE, 3)
//        );
//
//        List<Edge<String>> graph4 = Arrays.asList(
//                new Edge<>(vertexA, vertexB, 5),
//                new Edge<>(vertexA, vertexC, 2),
//                new Edge<>(vertexB, vertexC, 4),
//                new Edge<>(vertexB, vertexD, 8),
//                new Edge<>(vertexB, vertexE, 7),
//                new Edge<>(vertexD, vertexE, 2),
//                new Edge<>(vertexC, vertexE, 3)
//        );
//
//        new Kruskal<>(graph1).run();
//        new Kruskal<>(graph2).run();
//        new Kruskal<>(graph3).run();
//        new Kruskal<>(graph4).run();
//  
    }
}
