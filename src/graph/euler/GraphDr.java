/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph.euler;

/**
 *
 * @author Admin
 */
public class GraphDr {
    private int n;
    private int a[][];
    private int v[][];

    public GraphDr(int[][] a) {
        
        this.a = a;
    }

   

    
    //(1) Tìm deg tại 1 đỉnh
    int deg(int i) {
        int s = 0;
        for (int j = 0; j < n; j++) {
            s += a[i][j];
        }
        
        s += a[i][i];
        return s;
    }
    
    //(2)
    boolean allDegEven() {
        for (int i = 0; i < n; i++) {
            if(deg(i) % 2 == 1) return false;
        }
        return true;
    }
    
    //(3) kỉm tra tính liên kết
    boolean isConnected() {
        LinkedStack s = new LinkedStack();
        boolean [] p = new boolean[n];
        int i,j,k;
        for (i = 0; i < n; i++) {
            p[i] = false;
        }
        
        s.push(0);
        p[0] = true;
        while(!s.isEmpty()) {
            k = s.pop();
            for (i = 0;  i < n; i++) {
                if(!p[i] && a[k][i] > 0) {
                    s.push(i);
                    p[i] = true;
                }
                    
            }
        }
        
        for (i = 0;  i < n; i++) {
            if(!p[i]) {
                return false;
            }
        }
        
        return true;
               
              
    }
    
    boolean hasEulerCycle() {
        if(isConnected() && allDegEven()) {
            return true;
        }
        
        return false;
    }
    
    void eulerCycle(int k) {
        if(!hasEulerCycle()) {
            System.out.println("No euler cyle");
            return;
        }
        
        LinkedStack s = new LinkedStack();
        int[] eu = new int[100];
        int i, j, r, m;
        m = 0;
        s.push(k);
        
        while(!s.isEmpty()) {
            r = s.top();
            for (i = 0;  i < n; i++) {
                if(a[r][i] > 0) {
                    break;
                }
            }
            
            if (i == n) { //r bij cô lập
                s.pop();
                eu[m++] = r;
                
            } else {
                s.push(i);
                a[r][i]--;
                a[i][r]--;
            }
        }
        
        System.out.println("The euler cycle is: ");
        System.out.println(v[eu[0]]);
        for (i = 0;  i < m ; i++) {
            System.out.println(" -> " + v[eu[i]]);
        }
    }
}
