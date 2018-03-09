/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestdatecs;

/**
 * Driver class for Rectangle class
 * Creating 6 different rectangles and testing if they match or not
 * and what is the dimensions of the matched rectangle and match percentage rate
 * @author Ivo Georgiev (IfChyy)
 */
public class RectangleDriver {
    
    public static void main(String []args){
         //first test with two rectangles if the match
        Rectangle one = new Rectangle(50,150,300,150);
        Rectangle two = new Rectangle(150,150,350,150);
        
        System.out.println("Rect one: " +one.toString());
        System.out.println("Rect one: " +two.toString());
        System.out.println(one.intersection(two));
        
        System.out.println("\n");
         //second test with two rectangles if the match
        Rectangle three = new Rectangle(50,150,300,150);
        Rectangle four = new Rectangle(300,150,400,150);
        
        System.out.println("Rect three: " +three.toString());
        System.out.println("Rect four: " +four.toString());
        System.out.println(three.intersection(four));
        
        System.out.println("\n");
         //third test with two rectangles if the match expected result "NO MATCH"
        Rectangle five = new Rectangle(50,150,300,150);
        Rectangle six = new Rectangle(550,150,300,150);
        
        System.out.println("Rect three: " +five.toString());
        System.out.println("Rect four: " +six.toString());
        System.out.println(five.intersection(six));
        
    }
}
