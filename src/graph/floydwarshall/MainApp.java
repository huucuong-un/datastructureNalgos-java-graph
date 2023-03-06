/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph.floydwarshall;

/**
 *
 * @author Admin
 */
public class MainApp {
public final static int INF = Integer.MAX_VALUE;
    /*
     * Video Reference:
     */
    public static void main(String[] args) throws Exception {
            

        int[][] weightsMatrix = {
                {0, 3, 2, INF, INF},
                {INF, 0, INF, 7, INF},
                {INF, INF, 0, INF, 4},  
                {INF, INF, INF, 0, 6},
                {INF, 4, 5, INF, 0}
        };
        String[][] successorsMatrix = {
                {"-", "B", "C", "-", "-"},
                {"-", "-", "-", "D", "-"},
                {"-", "-", "-", "-", "E"},
                {"-", "-", "-", "-", "E"},
                {"-", "B", "C", "-", "-"}
        };
        new FloydWarshall(weightsMatrix, successorsMatrix).run();

    }

}
