/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestdatecs;

/**
 * Binary Tree driver class for Binary Search tree
 * creating a binary tree and nodes
 * @author Ivo Georgiev (IfChyy)
 */
public class BinaryTree {

    private static BinaryTreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public static void main(String[] args) {
        //create the tree and add nodes
        BinaryTree myTree = new BinaryTree();
        myTree.insert(5);
        myTree.insert(15);
        myTree.insert(25);
        myTree.insert(4);
        myTree.insert(6);
        myTree.insert(7);
        myTree.insert(9);
        myTree.insert(51);
        myTree.insert(54);
        myTree.insert(85);
        myTree.insert(35);
        //print the tree and second to max value
        myTree.printInOrder(root);
        System.out.println("find second to max");
        System.out.println(myTree.findSecToMax(root));
    }
    //print in order method iterating through the tree from left to right
    public void printInOrder(BinaryTreeNode top) {
        String output = " ";
        if (top != null) {
            printInOrder(top.left);
            System.out.println(top.value);
            printInOrder(top.right);
        }
    }
    //insert method with comparable to see where to place the next value
    public void insert(Comparable value) {
        int direction = 0;
        BinaryTreeNode parent = null, curr = root;
        
        for (;;) {
            //if current value is null place in root else left or right 
            if (curr == null) {
                BinaryTreeNode ins = new BinaryTreeNode(value);
                if (root == null) {
                    root = ins;
                } else if (direction < 0) {
                    parent.left = ins;
                } else {
                    parent.right = ins;
                }
                return;
            } 
            //check direction if node should go left or right using compareTo
            direction = value.compareTo(curr.value);
            if (direction == 0) {
                return;
            }
            parent = curr;
            if (direction < 0) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

    }
    //find the second to max node
    public Comparable findSecToMax(BinaryTreeNode root) {
        //check if tree is empty
        if (root == null) {
            System.out.println("Empty tree!");
            return -1;
        }
        //check if next value of previous is null if it is this is the second to max
        if(root.right.right == null){
           return root.value;
        }
        return findSecToMax(root.right);
    }

}
