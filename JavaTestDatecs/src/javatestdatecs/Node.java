/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestdatecs;

/**
 * Node class for the MyLinkedList class
 * creating new node data and successor
 * @author Ivo Georgiev (IfChyy)
 */
public class Node {
    
    protected Object data;
    protected Node next ;

    public Node(Object data, Node succ) {
        this.data = data;
        this.next = succ;

    }


  
    
    
}
