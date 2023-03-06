/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph.kruskal;

/**
 *
 * @author Admin
 */
public class Edge<T> implements Comparable<Edge<T>> {

    private final Vertex<T> source;
    private final Vertex<T> destination;
    private final int weight;

    public Edge(Vertex<T> source, Vertex<T> destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
        
        destination.addNeighbor(source);
        source.addNeighbor(destination);
    }

    public Vertex<T> getSource() {
        return source;
    }

    public Vertex<T> getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "" + source  + destination + " (weight: " + weight +")";
    }

    @Override
    public int compareTo(Edge<T> edge) {
        return Integer.compare(weight, edge.getWeight());
    }

}