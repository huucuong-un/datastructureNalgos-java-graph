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
public class Edge<T> implements Comparable<Edge<T>> {

    private final int weight;
    private boolean included;
   

    public Edge(int weight) {
        this.weight = weight;
      

    }
   

   

    public Edge(int weight, boolean included) {
        this.weight = weight;
        this.included = included;
        

    }

    public int getWeight() {
        return weight;
    }

    public boolean isIncluded() {
        return included;

    }

    public void setIncluded(boolean included) {
        this.included = included;
    }

   
    

    
    
    @Override
    public String toString() {
        return "Edge{" + "weight=" + weight + ", included=" + included + '}';
    }

    @Override
    public int compareTo(Edge<T> edge) {
        return Integer.compare(weight, edge.getWeight());
    }

}
