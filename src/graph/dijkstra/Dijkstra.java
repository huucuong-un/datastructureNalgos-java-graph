/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph.dijkstra;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javafx.scene.layout.Priority;

/**
 *
 * @author Admin
 */
public class Dijkstra<T> {
    public void calculateShortestPath(Node<T> source) {
        source.setDistance(0); //set the first elemet with value = 0
        
        Set<Node<T>> settledNodes = new HashSet<>();//settledNodes
        
        Queue<Node<T>> unsettledNodes = new PriorityQueue<>(Collections.singleton(source));
        
        while(!unsettledNodes.isEmpty()) {
            Node<T> currentNode = unsettledNodes.poll();
            currentNode.getAdjacentNodes()
                       .entrySet().stream()
                    .filter(entry -> !settledNodes.contains(entry.getKey()))
                    .forEach(entry -> {
                        evaluateDistanceAndPath(entry.getKey(), entry.getValue(), currentNode);
                        unsettledNodes.add(entry.getKey());
                    });
             settledNodes.add(currentNode);
        }               
        
           
        
    }
    
    private void evaluateDistanceAndPath(Node<T> adjacentNode, Integer edgeWeight, Node<T> sourceNode) {
        Integer newDistance = sourceNode.getDistance() + edgeWeight;
        if (newDistance < adjacentNode.getDistance()) {
            adjacentNode.setDistance(newDistance);
            adjacentNode.setShortestPath(Stream.concat(sourceNode.getShortestPath().stream(), Stream.of(sourceNode)).collect(Collectors.toList()));
        }
    }
    
    public void printPaths(List<Node<T>> nodes) {
        nodes.forEach(node -> {
            String path = node.getShortestPath().stream()
                    .map(Node::getName).map(Objects::toString)
                    .collect(Collectors.joining(" -> "));

            if (path.trim().isEmpty() || path == null) System.out.printf("%s : %s\n", node.getName(), node.getDistance() );
            else System.out.printf("%s -> %s : %s\n",path, node.getName(), node.getDistance() );
            
        });
    }
}
