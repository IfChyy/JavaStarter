/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestdatecs;

/**
 * Rectangle class
 *  to create a rectangle
 * and a Intersection method to check if two rectangles intersect
 * @author Ivo Georgiev (IfChyy)
 */
public class Rectangle {

    public int leftX, bottomY, width, height;

    public Rectangle(int leftX, int bottomY, int width, int height) {
        this.leftX = leftX;
        this.bottomY = bottomY;
        this.width = width;
        this.height = height;
    }
    
    //to string method to display information about rect
    @Override
    public String toString() {
        return "leftX: " + leftX + ", bottomY: " + bottomY + ", width: " + width + ", height: " + height;
    }

}
