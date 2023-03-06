/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph.prim;

/**
 *
 * @author Admin
 */
public class Neighbor<T> {
    private final Vertex<T> vertex;
    private final Edge edge;

    public Neighbor(Vertex<T> vertex) {
        this.vertex = vertex;
        this.edge = null;
    }

    
    
    public Neighbor(Vertex<T> vertex, Edge edge) {
        this.vertex = vertex;
        this.edge = edge;
    }
    
    
   

    public Vertex<T> getVertex() {
        return vertex;
    }

    public Edge getEdge() {
        return edge;
    }

     public boolean isVisited() {
        return edge.isIncluded() || vertex.isVisited();
    }
    
    @Override
    public String toString() {
        return "Neighbor{" + "vertex=" + vertex + ", edge=" + edge + '}';
    }

  

  
    
    
}
