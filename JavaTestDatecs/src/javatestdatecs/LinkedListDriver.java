/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestdatecs;

import java.util.LinkedList;

/**
 * Driver class for MyLinkedList and Node classes
 * creating first two nodes and adding at front, at back
 * remove from front or back,
 * show position of searched element
 * delete element by representational value "String"
 * delete first and last nodes
 * @author Ivo Georgiev (IfChyy)
 */
public class LinkedListDriver {

    static MyLinkedList zooList;

    public static void main(String[] args) {
        //create SLL
        zooList = new MyLinkedList();
        
        //create first Node
        Node dog = new Node("dog", null);
        
        //add some nodes
        zooList.first = new Node("cat", new Node("ant", dog));
        //print the initial list
        System.out.println("Initial List: " + zooList.printFirstToLast());
        
        //add at first position
        System.out.println("Add node monkey at first");
        zooList.addAtFirst("monkey");
        //list after adding at first position
         System.out.println("List: " + zooList.printFirstToLast());
         
         //add item at last position
         System.out.println("Add last node donkey");
         zooList.addAtLast("donkey");
         //list after adding at last position
         System.out.println("List: " + zooList.printFirstToLast());
         
         //look for node dog at show its position
         System.out.println("Looking for dog and its position: "
                 + zooList.findNode("dog"));

         //delete node "cat"
         System.out.println("Delete Node: cat");
         zooList.deleteNode("cat");
         //list after deleting node cat
         System.out.println("List: " + zooList.printFirstToLast());
         
         //delete first node;
         System.out.println("Delete first node");
         zooList.deleteFirst();
         System.out.println("List: " + zooList.printFirstToLast());
         
          //delete last node;
         System.out.println("Delete last node");
         
         zooList.deleteLast();
         System.out.println("List: " + zooList.printFirstToLast());
         
        
         
    }

   

}
