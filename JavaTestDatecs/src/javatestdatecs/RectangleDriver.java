/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestdatecs;

/**
 * Driver class for Rectangle class Creating 6 different rectangles and testing
 * if they match or not and what is the dimensions of the matched rectangle and
 * match percentage rate
 *
 * @author Ivo Georgiev (IfChyy)
 */
public class RectangleDriver {

    public static void main(String[] args) {

        Rectangle one = new Rectangle(5, 15, 40, 5);
        Rectangle two = new Rectangle(10, 5, 25, 15);
        System.out.println(isMatched(one, two));
        System.out.println();

        System.out.println(isMatched(two, one));
    }
    static int matchX, matchY, matchWidth, matchHeight, matchArea;
    static double matchPercent;

    /**
     *
     * @param rectOne the first rectangle to be matched
     * @param rectTwo the second rectangle to be matched
     * @return return true or false if the matched and info about match
     */
    public static boolean isMatched(Rectangle rectOne, Rectangle rectTwo) {
        //first check if rects are touching or not
        if ((rectOne.leftX + rectTwo.leftX) < rectOne.width) {
            //sout the rect's info to be matched
            System.out.println("Match: " + rectOne.toString()
                    + "\nWith: " + rectTwo.toString());
            //create new x value
            matchX = Math.max(rectOne.leftX, rectTwo.leftX);
            //create new width value
            matchWidth = Math.min(rectOne.width, rectTwo.width) - matchX;
            //create new y value
            matchY = Math.max(rectOne.bottomY, rectTwo.bottomY);
            //create new height value
            matchHeight = matchX + matchY;
            //create new area value
            matchArea = matchWidth * 2 + matchHeight * 2;
            //create nex percent match value
            matchPercent = (double) matchArea / ((rectOne.width * 2 + rectOne.height * 2)
                    + (rectTwo.width * 2 + rectTwo.height * 2));
            //display the new rect infomration
            System.out.println("New Rect x:" + matchX + ", width:" + matchWidth + ", heigth:" + matchHeight
                    + ", matchArea:" + matchArea + ", match%:" + (int) (matchPercent * 100));
            return true;
        } else {
            System.out.println("No Match");
        }

        return false;
    }
}
