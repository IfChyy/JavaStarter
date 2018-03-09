/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestdatecs;

/**
 *
 * @author Ivo Georgiev (IfChyy)
 * class Box containing
 * height, width, length and if its empty or full
 * and a toString method to represent the information of the box
 */
public class Box {
    //parameters
    double boxHeight, boxWidth, boxLenght;
    boolean isEmpty;
    // constructor to create the box instance which is by default empty;
    public Box(double boxHeight, double boxWidth, double boxLenght) {
        this.boxHeight = boxHeight;
        this.boxWidth = boxWidth;
        this.boxLenght = boxLenght;
        this.isEmpty = false;
    }
    
    //--------------GETTERS NAD SETTERS

    public double getBoxHeight() {
        return boxHeight;
    }

    public void setBoxHeight(double boxHeight) {
        this.boxHeight = boxHeight;
    }

    public double getBoxWidth() {
        return boxWidth;
    }

    public void setBoxWidth(double boxWidth) {
        this.boxWidth = boxWidth;
    }

    public double getBoxLenght() {
        return boxLenght;
    }

    public void setBoxLenght(double boxLenght) {
        this.boxLenght = boxLenght;
    }

    public boolean isIsEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    @Override
    public String toString() {
        return "Box has: " + "height=" + boxHeight + ", width=" + boxWidth + 
                ", lenght=" + boxLenght + ", and it's: " + (isEmpty? "full" : "empty");
    }
    
    
}
