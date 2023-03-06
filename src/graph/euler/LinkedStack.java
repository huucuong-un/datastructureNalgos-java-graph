/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph.euler;

import java.util.EmptyStackException;

/**
 *
 * @author Admin
 */
class Node {
    public Integer info;
    public Node next;
    public Node(Integer x, Node p) {
        info = x;
        next = p;
    }
    
    public Node(Integer x) {
        this(x,null);
    }
}

public class LinkedStack {
    protected Node head;
    
    public LinkedStack() {
        head = null;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void push(Integer x) {
        head = new Node(x, head);
        
    }
    
    Integer top() throws EmptyStackException {
        if(isEmpty()) throw new EmptyStackException();
        return(head.info);
    }
    
    public Integer pop() throws EmptyStackException {
        if(isEmpty()) throw new EmptyStackException();
        Integer x = head.info;
        head = head.next;
        return x;
    }
}
