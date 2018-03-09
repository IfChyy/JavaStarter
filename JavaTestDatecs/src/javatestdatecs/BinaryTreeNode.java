/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestdatecs;

/**Binary tree node class
 *
 * @author Ivo Georgiev (IfChyy)
 */
public class BinaryTreeNode {
    public Comparable value;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(Comparable value) {
        this.value = value;
        this.left = null;
        this.right = null;
        
    }
    
    public BinaryTreeNode insertLeft(int leftValue){
        this.left = new BinaryTreeNode(leftValue);
        
        return this.left;
    }
    
     public BinaryTreeNode insertRight(int rightValue){
        this.right = new BinaryTreeNode(rightValue);
        
        return this.right;
    }
     
     
     
    
}
