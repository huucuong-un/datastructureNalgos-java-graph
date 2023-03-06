/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph.prim;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import static java.util.Comparator.comparingInt;

/**
 *
 * @author Admin
 * @param <T>
 */
public class Prim<T> {

    public List<Vertex<T>> graph;

    public Prim(List<Vertex<T>> graph) {
        this.graph = graph;
    }

    
    public void run() {
        if (!graph.isEmpty()) {
            graph.get(0).setVisited(true); //set a first number as visited
        }
        while (graph.stream().anyMatch(vertex -> !vertex.isVisited())) { //khi nào có vertex chưa được đánh visited là còn chạy while
            graph.stream().filter(Vertex::isVisited)
                    .map(Vertex::getNeighbors)
                    .flatMap(Collection::stream)
                    .filter(neighbor -> !neighbor.isVisited())
                    .min(comparingInt(n -> n.getEdge().getWeight())) //Neighbor<T>
                    .ifPresent(candidate -> {
                        candidate.getVertex().setVisited(true);
                        candidate.getEdge().setIncluded(true);
                    });
        }
        graph.forEach(System.out::println);
    }
}
