/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestdatecs;

/**
 *
 * @author Ivo Georgiev (IfChyy) 
 * driver class BoxText to show boxes info and
 * manipulate some data
 */
public class BoxTest {

    public static void main(String[] args) {

        Box boxOne = new Box(1, 1, 1);
        Box boxTwo = new Box(2, 4, 5);
        Box boxThree = new Box(34, 2, 3);

        System.out.println("Box one:");
        System.out.println(boxOne.toString());
        boxOne.setBoxHeight(22.2);
        boxOne.setIsEmpty(true);
        System.out.println("Box one after manipulation: " + boxOne.toString());
        System.out.println("");
        
        System.out.println("Box two:");
        System.out.println(boxTwo.toString());
        boxTwo.setBoxLenght(15);
        System.out.println("Box two height: " +boxTwo.getBoxHeight());
        boxTwo.setIsEmpty(true);
        System.out.println("Box two after manipulation: " + boxTwo.toString());
        System.out.println("");
        
        System.out.println("Box three:");
        System.out.println(boxThree.toString());
        boxThree.setBoxHeight(15.15215125152);
        System.out.println("Box three emtpy ?" + boxThree.isEmpty);
        System.out.println("Box three after manipulation: " + boxThree.toString());

    }
}
