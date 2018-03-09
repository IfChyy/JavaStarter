/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestdatecs;

import java.util.*;

/**
 * Driver class to run all algorithms exercises
 *
 * @author Ivo Georgiev (IfChyy)
 */
public class Algorithms {

    static int myArray[] = new int[]{40, 35, 80, 75, 60, 90, 70, 75, 50, 22};

    public static void main(String[] args) {

        //Selection sort Algorithm
        // System.out.println(SelectionSort());
        // Bubble sort
        // System.out.println(BubbleSort());
        // Insertion Sort
        System.out.println(insertionSort());
    }

    //------------------------SELECTION SORT-----------------------
    //sort an array by swaping the biggest leftmost element with the shortest right
    public static String SelectionSort() {
        String output = "";

        output += "init array: " + Arrays.toString(myArray);
        /*
        ArrayUtil.swap(array, value1, value2) - not recognizable if library not
        installed
        so i reverted to the old way of doing swap
         */
        int count = 0;
        for (int i = 0; i < myArray.length - 1; i++) {

            int minPos = minimumPosition(myArray, i);
            int temp = myArray[i];
            //if position of count element in array not equal to min element
            if (myArray[minPos] != myArray[count]) {
                //swap count element with min element
                myArray[count] = myArray[minPos];
                myArray[minPos] = temp;
                //display swap
                output += "\niteration: " + count + ", swap: " + myArray[count]
                        + ", with: " + myArray[minPos] + ", list:" + Arrays.toString(myArray);
            }
            //increment count element with one
            count++;

        }
        return output;
    }

    //get the minimum position in an array for selection sort algorithm
    public static int minimumPosition(int[] array, int from) {
        int minPos = from;
        for (int i = from + 1; i < array.length; i++) {
            if (array[i] < array[minPos]) {
                minPos = i;
            }
        }
        return minPos;
    }
    //------------------------SELECTION SORT-----------------------

    //----------------------BUBBLE SORT --------------------------
    //sorts by swaping first and next elements
    public static String bubbleSort() {
        String output = "";

        int temp = 0;
        output += "init array: " + Arrays.toString(myArray);
        for (int first = 0; first < myArray.length; first++) {
            for (int next = 1; next < myArray.length; next++) {

                if (myArray[next - 1] > myArray[next]) {
                    temp = myArray[next - 1];
                    myArray[next - 1] = myArray[next];
                    myArray[next] = temp;
                    // output += "\n sorted: " + Arrays.toString(myArray);

                    output += "\niteration: " + first + ", swap: " + myArray[next - 1]
                            + ", with: " + myArray[next] + ", list:" + Arrays.toString(myArray);
                }
            }

        }
        return output;
    }

    //----------------------BUBBLE SORT --------------------------
    //----------------------INSERTION SORT --------------------------
    //like sorting your cards while you play a card game
    //Insertion sort sorts every next element in its right position
    public static String insertionSort() {
        String output = " ";
        output += "init array: " + Arrays.toString(myArray);

        int first, previous, temp;
        for (first = 1; first < myArray.length; first++) {

            previous = first - 1;

            while (previous >= 0 && myArray[previous] > myArray[first]) {

                temp = myArray[first];
                myArray[first] = myArray[previous];
                myArray[previous] = temp;
                first = previous;
                previous--;

            }
            output += "\nIteration: swap: " + myArray[previous + 1]
                    + ", to pos: " + (first + 1) + ", list:" + Arrays.toString(myArray);
        }

        return output;
    }

    //----------------------INSERTION SORT --------------------------
}
