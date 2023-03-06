/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph.kruskal;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MainApp {

   
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


        List<Edge<String>> graph1 = Arrays.asList(
                new Edge<>(vertex0, vertex1, 4),
                new Edge<>(vertex0, vertex7, 8),
                new Edge<>(vertex1, vertex2, 8),
                new Edge<>(vertex1, vertex7, 11),
                new Edge<>(vertex2, vertex3, 7),
                new Edge<>(vertex2, vertex5, 4),
                new Edge<>(vertex2, vertex8, 2),
                new Edge<>(vertex3, vertex4, 9),
                new Edge<>(vertex3, vertex5, 14),
                new Edge<>(vertex4, vertex5, 10),
                new Edge<>(vertex5, vertex6, 2),
                new Edge<>(vertex6, vertex7, 1),
                new Edge<>(vertex6, vertex8, 6),
                new Edge<>(vertex7, vertex8, 7)
        );

        System.out.println(graph1);
        System.out.println(new Kruskal<>(graph1).getGraph());;

        System.out.println("Minium spanning tree by Kruskal Algorithm: ");
        new Kruskal<>(graph1).run();
//        new Kruskal<>(graph2).run();
//        new Kruskal<>(graph3).run();
//        new Kruskal<>(graph4).run();

    }

}