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

    public String intersection(Rectangle rect) {
        //ares of rect for match rate in percentage
        double firstRectArea = this.width * 2 + this.height * 2;
        double secondRectArea = rect.width * 2 + rect.height * 2;
        //variables for new intersected rect
        int intersectionX, intersectionWidth;

        if ((this.leftX + this.width) > rect.leftX) {
            //find intersection widht and x
            intersectionX = rect.leftX;
            intersectionWidth = (this.width + this.leftX) - intersectionX;
            //get intersection area for percentage
            double intersectionArea = intersectionWidth * 2 + rect.height * 2;
            //find the match rate in percentage
            double matchRate = intersectionArea / (firstRectArea + secondRectArea);
            //return some information about the new rect
            return "Intersected rect has: leftX: " + intersectionX
                    + ", bottomY:" + rect.bottomY
                    + ", width: " + intersectionWidth
                    + ", height: " + rect.height
                    + ", area: " + intersectionArea
                    + ", Match: " + (int) (matchRate * 100) + "%";

        }
        return "No match";
    }
    
    //to string method to display information about rect
    @Override
    public String toString() {
        return "leftX: " + leftX + ", bottomY: " + bottomY + ", width: " + width + ", height: " + height;
    }

}
