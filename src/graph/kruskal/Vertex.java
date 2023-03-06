/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph.kruskal;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class Vertex<T> {

    private final T data;
    private boolean visited; //blue mark //completely visited// no otherway to reach to this vertex -
                                                             // -> already viisited all the paths going throunh this vertex without finding any cycle   
    private boolean beingVisited; //green mark -> on our current path 
  
    private Set<Vertex<T>> neighbors = new HashSet<>(); //HashSet có sắp xếp
    
    public Vertex(T data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }

    public Set<Vertex<T>> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(Set<Vertex<T>> neighbors) {
        this.neighbors = neighbors;
    }

  

    public void addNeighbor(Vertex<T> vertex) {
        neighbors.add(vertex);
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "" + data ;
    }

}
