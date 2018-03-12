/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestdatecs;

import static javatestdatecs.LinkedListDriver.zooList;

/**
 * LinkedList class creating the first node and methods to manipulate list
 * @author Ivo Georgiev (IfChyy)
 */
public class MyLinkedList {

    public Node first;

    // prints all the elements of the list
    public static String printFirstToLast() {
        String output = "";

        for (Node curr = zooList.first; curr != null; curr = curr.next) {
            output += curr.data + ", ";
        }

        return output;
    }

    //ads a note at first position
    public static void addAtFirst(Object nodeData) {
        zooList.first = new Node(nodeData, zooList.first);
    }

    //adds a note at last position after iteration thourgh the list
    public static void addAtLast(Object nodeData) {
        Node last = null;

        for (Node curr = zooList.first; curr != null; curr = curr.next) {
            last = curr;
        }

        last.next = new Node(nodeData, null);
    }

    //iterates through the list to find a specific node and delets it
    public static void deleteNode(Object nodeData) {

        for (Node curr = zooList.first; curr != null; curr = curr.next) {
            if (curr.next != null) {
                Node search = curr.next;

                if (nodeData.equals(search.data)) {
                    curr.next = search.next;
                }
            }
        }
    }

    //delete the fist node
    public static void deleteFirst() {
        zooList.first = zooList.first.next;
    }

    //delete the last node after iterationg through the list
    public static void DeleteLast() {
        Node last = null;

        for (Node curr = zooList.first; curr != null; curr = curr.next) {
            if (curr.next != null) {
                last = curr;

            }
        }
        last.next = null;
    }

    //search for a specific node and return its position
    public static String findNode(Object nodeData) {
        Node searched = null;
        String output = "";
        int count = 0;

        for (Node curr = zooList.first; curr != null; curr = curr.next) {

            count++;

            if (curr.data.equals(nodeData)) {
                output += "found " + curr.data + " at position: " + count;
            }

        }
        return output;
    }
}
