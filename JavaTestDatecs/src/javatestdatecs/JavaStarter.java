/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestdatecs;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * Main class
 * Created methods for each java starter exercise and binary exercises
 * in main method we have tests to run each separate exercise
 *
 * @author Ivo Georgiev (IfChyy)
 */
public class JavaStarter {

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Exercise One
        // System.out.println("Exercise one \n" + ExerciseOne());
        // Exercise Three
        // System.out.println("Exercise three \n" + ExerciseThree());
        // Exercise Four
        // System.out.println("Exercise four \n" + ExerciseFour());
        // Exercise Five
        // System.out.println(ExerciseFive());
        // Exericse Sevem
        // System.out.println(ExerciseSeven());
        // Exercise Eight
        // System.out.println(ExerciseEightDecrypt(ExerciseEightEncrypt("Datecs", 5), 5));
        // Exercise Nine
        // System.out.println(ExerciseNine("zashtoto"));
        // Exercise Eleven
        //----------------------BINARY NOTATION--------------------
        //binary notation Exercise Six
        // type "A,B,C,D" for any of x to be 1 or 0 
//        System.out.println("if Any is 0 for: 10101010 - "
//                + (binaryExSix(10101010, "A") == 1 ? true : false));
//
//        System.out.println("if Any is 0 for: 1111111 - "
//                + (binaryExSix(11111111, "A") == 1 ? true : false));
//
//        System.out.println("if Any is 1 for: 00001000 - "
//                + (binaryExSix(00001000, "B") == 1 ? true : false));
//
//        System.out.println("if Any is 1 for: 00000000 - "
//                + (binaryExSix(00000000, "B") == 1 ? true : false));
//
//        System.out.println("if less-significant is 1 for: 00001000 - "
//                + (binaryExSix(00001000, "C") == 1 ? true : false));
//
//        System.out.println("if less-significant is 1 for: 00000001 - "
//                + (binaryExSix(00000001, "C") == 1 ? true : false));
//
//        System.out.println("if most-significant is 0 for: 10001000 - "
//                + (binaryExSix(10001000, "D") == 1 ? true : false));
//
//        System.out.println("if most-significant is 0 for: 00000001 - "
//                + (binaryExSix(00000001, "D") == 1 ? true : false));
        // Bynary exercise seven rotate left
//        rotate_left(0x12345678, (char)4);
//        rotate_left(0x12345678, (char)20);
//        rotate_left(0x12345678, (char)2);
    }

    /**
     * Exercise One creates a Christmas tree then reverse it upside down.
     *
     * @return output a string representing Christmas tree and a reversed one
     */
    public static String exerciseOne() {
        String output = "";//the output of the following method
        int asterisk,// the number of asterisk to draw
                spaces,//the number of spaces to draw
                asteriskRows; // the number of asterisk rows

        //outer for loop to count the number of rows for the top part of the tree
        for (asteriskRows = 0; asteriskRows < 5; asteriskRows++) {
            //indent five spaces before first asterisk
            //then substract the rows and indent again
            for (spaces = 0; spaces < 4 - asteriskRows + 1; spaces++) {
                output += " ";
            }
            //create the left part of the christmass three
            for (asterisk = 0; asterisk < (asteriskRows * 2 + 1); asterisk++) {
                output += "*";
            }

            output += "\n";
        }

        //second outer loop to create the bottom part of the tree
        for (asteriskRows = 4; asteriskRows > 0; asteriskRows--) {
            output += " ";
            //indent four spaces before first asterisk 
            //then lower it by the rows
            for (spaces = 0; spaces < 4 - asteriskRows + 1; spaces++) {
                output += " ";
            }
            //create the left part of the christmass three
            for (asterisk = 1; asterisk < asteriskRows * 2; asterisk++) {
                output += "*";
            }

            output += "\n";
        }

        return output;

    }

    /**
     * Exercise three gets an input form the user and shows for the value what
     * type of bills or coins could the value be separated in.
     *
     * @return output a string representing the bills and coins
     */
    public static String exerciseThree() {
        String output = " ";
        //types of bill
        final int ONE_HUNDRED = 100, FIFTY = 50, TWENTY = 20, TEN = 10,
                FIVE = 5, TWO = 2, ONE = 1;
        //types of coins
        final double COIN_FIFTY = 0.50, COIN_TWENTY = 0.20, COIN_TEN = 0.10,
                COIN_FIVE = 0.05, COIN_TWO = 0.02, COIN_ONE = 0.01;

        int countBills = 0;
        int countCoins = 0;

        //initialize the input 
        Scanner input = new Scanner(System.in);
        //ask user to enter a value
        System.out.println("Enter a value..");
        //get the value the user typed in double
        Double value = input.nextDouble();

        output += "Value is: " + value + " лв\n";

        //convert the value to int for better conversion with coins.
        double newValue = value * 100;

        //---------------------count the bills
        //count 100 bills
        countBills = (int) (newValue / (ONE_HUNDRED * 100));
        if (countBills > 0) {
            output += countBills + " x 100 лв\n";
            newValue -= countBills * (ONE_HUNDRED * 100);
        }
        //count 50 bills
        countBills = (int) (newValue / (FIFTY * 100));
        if (countBills > 0) {
            output += countBills + " x 50 лв\n";
            newValue -= countBills * (FIFTY * 100);
        }
        //count 20 bills
        countBills = (int) (newValue / (TWENTY * 100));
        if (countBills > 0) {
            output += countBills + " x 20 лв\n";
            newValue -= countBills * (TWENTY * 100);
        }
        //count 10 bills
        countBills = (int) (newValue / (TEN * 100));
        if (countBills > 0) {
            output += countBills + " x 10 лв\n";
            newValue -= countBills * (TEN * 100);
        }
        //count 5 bills
        countBills = (int) (newValue / (FIVE * 100));
        if (countBills > 0) {
            output += countBills + " x 5 лв\n";
            newValue -= countBills * (FIVE * 100);
        }
        //count 2 bills
        countBills = (int) (newValue / (TWO * 100));
        if (countBills > 0) {
            output += countBills + " x 2 лв\n";
            newValue -= countBills * (TWO * 100);
        }
        //count 1 bills
        countBills = (int) (newValue / (ONE * 100));
        if (countBills > 0) {
            output += countBills + " x 1 лв\n";
            newValue -= countBills * (ONE * 100);
        }

        //---------------------count coins
        //count 0.50 coins
        countCoins = (int) (newValue / (COIN_FIFTY * 100));
        if (countCoins > 0) {
            output += countCoins + " x 50 стотинки\n";
            newValue -= countCoins * (COIN_FIFTY * 100);
        }
        //count 0.20 coins
        countCoins = (int) (newValue / (COIN_TWENTY * 100));
        if (countCoins > 0) {
            output += countCoins + " x 20 стотинки\n";
            newValue -= countCoins * (COIN_TWENTY * 100);
        }
        //count 0.10 coins
        countCoins = (int) (newValue / (COIN_TEN * 100));
        if (countCoins > 0) {
            output += countCoins + " x 10 стотинки\n";
            newValue -= countCoins * (COIN_TEN * 100);
        }
        //count 0.05 coins
        countCoins = (int) (newValue / (COIN_FIVE * 100));
        if (countCoins > 0) {
            output += countCoins + " x 5 стотинки\n";
            newValue -= countCoins * (COIN_FIVE * 100);
        }
        //count 0.02 coins
        countCoins = (int) (newValue / (COIN_TWO * 100));
        if (countCoins > 0) {
            output += countCoins + " x 2 стотинки\n";

            newValue -= countCoins * (COIN_TWO * 100);

        }
        //count 0.01 coin
        countCoins = (int) (newValue / (COIN_ONE * 100));
        if (countCoins > 0) {

            output += countCoins + " x 1 стотинка\n";
            newValue -= countCoins * (COIN_ONE * 100);
        }

        return output;
    }

    /**
     * Exercise four randomizes a number between 1 and 10 sets a random for
     * radius and height then calculates a cylinder surface and volume.
     *
     * @return output a string representing the radius, height, surface and
     * volume
     */
    public static String exerciseFour() {
        String output = "";
        //create a random instance
        Random random = new Random();
        //get random 1 to 10 for radius and height
        int radius = random.nextInt(10) + 1;
        int height = random.nextInt(10) + 1;
        //display the randomized values
        output += "radius: " + radius + ", height: " + height;
        //show cylinder volume
        double cylinderVolume = Math.PI * (radius * radius) * height;
        output += "\ncylinder volume: " + String.format("%.2f", cylinderVolume);
        //show cylinder surface
        double cylinderSurface = 2 * Math.PI * radius * height;
        output += "\ncylinder surface: " + String.format("%.2f", cylinderSurface);

        return output;
    }

    /**
     * Exercise five get the user to pick collection, division, substraction,
     * multiplication, and then ask for two numbers to calculate.
     *
     * if other than the selected commands is typed restart the program
     *
     * @return output a string representing the type of calculation
     */
    public static String exerciseFive() {
        String output = "";
        //check what kind of command wants the user to use
        Scanner input = new Scanner(System.in);
        System.out.println("Type what would you like to do:"
                + "\n for collection type 1"
                + "\n for substraction type 2"
                + "\n for multiplication type 3"
                + "\n for division type 4");

        int typeOfCalculation = input.nextInt();
        //variables to hold the numbers typed by the user
        Double numberOne = 0.0;
        Double numberTwo = 0.0;

        //check what kind of command has been used and ask the user for two numbers
        //then by the command selected calculate the values
        if (typeOfCalculation == 1) {
            System.out.println("You have selected collection!");

            System.out.println("Select first number:");
            numberOne = input.nextDouble();

            System.out.println("Select second number:");
            numberTwo = input.nextDouble();

            output += "\nCollection: " + numberOne + " + " + numberTwo + " = "
                    + (numberOne + numberTwo);

        } else if (typeOfCalculation == 2) {
            System.out.println("You have selected substraciton!");

            System.out.println("Select first number:");
            numberOne = input.nextDouble();

            System.out.println("Select second number:");
            numberTwo = input.nextDouble();

            output += "\nSubstraciton: " + numberOne + " - " + numberTwo + " = "
                    + (numberOne - numberTwo);

        } else if (typeOfCalculation == 3) {
            System.out.println("You have selected multiplication!");

            System.out.println("Select first number:");
            numberOne = input.nextDouble();

            System.out.println("Select second number:");
            numberTwo = input.nextDouble();

            output += "\nMultiplication: " + numberOne + " * " + numberTwo + " = "
                    + (numberOne * numberTwo);

        } else if (typeOfCalculation == 4) {
            System.out.println("You have selected division!");

            System.out.println("Select first number:");
            numberOne = input.nextDouble();

            System.out.println("Select second number:");
            numberTwo = input.nextDouble();

            output += "\nDivision: " + numberOne + " / " + numberTwo + " = "
                    + (numberOne / numberTwo);

        } else {
            System.out.println(exerciseFive());
            output = " ";
        }

        return output;
    }

    /**
     * Exercise seven gets an input year from the user if year is divided by 4
     * and not by 100 its a leap year if its divided by 100 and by 400 its a
     * leap year else its not if the typed year is less than 1582 error will be
     * displayed.
     *
     * @return then tell if its a leap year
     */
    public static String exerciseSeven() {
        String output = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Type a year and I will tell you if its a leap year!");
        int yearInput = in.nextInt();

        //test if year is earlier than 1582 and display error messege or continue
        if (yearInput < 1582) {
            output += " Oops, not supporting years before 1582!";

        } else {

            if (yearInput % 4 == 0 && yearInput % 100 != 0) {
                output += yearInput + " is a leap year!";

            } else if (yearInput % 100 == 0 && yearInput % 400 == 0) {
                output += yearInput + " is a leap year!";

            } else {
                output += yearInput + " is not a leap year!";
            }
        }

        return output;
    }

    /**
     * Method to encrypt a word by shifting its letters
     *
     * @param text the text inputed by the user to be encrypt
     * @param shifting the number of shift to perform
     * @return the new encrypted text
     */
    public static String exerciseEightEncrypt(String text, int shifting) {
        String output = "";

        text = text.toLowerCase();

//        output += "Before encrypting: " + text;
//        output += "\nAfter encrypting: ";
        for (int i = 0; i < text.length(); i++) {
            //get each character from the aphabet found in text
            int charPos = ALPHABET.indexOf(text.charAt(i));
            //shift the position by the (shifting) number specified
            // and check if not going out of bounds
            int character = (shifting + charPos) % 26;
            //create new char from the shifted value
            char charReplaced = ALPHABET.charAt(character);
            //add that character to the shifter
            output += charReplaced;
        }

        return output;

    }

    /**
     * Method to decrypt a word by shifting its letters
     *
     * @param text the text inputed by the user to be decrypt
     * @param shifting the number of shift to perform
     * @return the new decrypted text
     */
    public static String exerciseEightDecrypt(String text, int shifting) {
        String output = "";
        text = text.toLowerCase();

        output += "Before decripting: " + text;
        output += "\nAfter decripting: ";

        for (int i = 0; i < text.length(); i++) {
            //get the character at position
            int charPos = ALPHABET.indexOf(text.charAt(i));
            //shift the char position by (shifting) and check if it has
            //remainder to not go out of bounds
            int character = (charPos - shifting) % 26;
            //if it goes out of bounds add the lenght of the alphabet to the char
            if (character < 0) {
                character = ALPHABET.length() + character;
            }
            //replace the char with the original one
            char charReplaced = ALPHABET.charAt(character);
            output += charReplaced;
        }
        return output;
    }

    /**
     * count how many times a letter appear in a sentence or word
     *
     * @param text - the text to check for specific letters
     * @return return back the hash map of values
     */
    public static HashMap<Character, Integer> exerciseNine(String text) {

        HashMap<Character, Integer> alphabetMap = new HashMap<>();

        text = text.toLowerCase();
        int count = 0;
        //go through each letter of the alphabet
        for (int alphabetPos = 0; alphabetPos < ALPHABET.length(); alphabetPos++) {
            //put each char in the hashmap with value 0
            alphabetMap.put(ALPHABET.charAt(alphabetPos), 0);
            //iterate through the word given or sentence
            for (int textPos = 0; textPos < text.length(); textPos++) {

                //check if char in sentence is in aphabet
                if (text.charAt(textPos) == ALPHABET.charAt(alphabetPos)) {
                    count++;
                    //count how many times the char appear and change the count
                    //in the hash map
                    alphabetMap.put(text.charAt(textPos), count);
                }
            }
            //for each new letter from the alphabet restore count to 0
            count = 0;
        }

        return alphabetMap;
    }

//------------------------------BINARY NOTATION-----------------------
    /**
     *
     * @param x the bits we are going to check
     * @param typeOfX the type of exercise
     * @return 1 if true or x if false; firstly we convert the int of bits into
     * array of strings then we check if the any of those bits corresponds to
     * our exercise
     */
    public static int binaryExSix(int x, String typeOfX) {
        String[] bitArray = Integer.toString(x).split("");

        for (int i = 0; i < bitArray.length; i++) {
            if (typeOfX.equals("A")) {
                //if any bit is 0 return 1(true)
                if (Integer.parseInt(bitArray[i]) == 0) {
                    return 1;
                }
            } else if (typeOfX.equals("B")) {
                if (Integer.parseInt(bitArray[i]) == 1) {
                    return 1;
                }
            } else if (typeOfX.equals("C")) {
                if (Integer.parseInt(bitArray[bitArray.length - 1]) == 1) {
                    return 1;
                }
            } else if (typeOfX.equals("D")) {
                if (Integer.parseInt(bitArray[0]) == 0) {
                    return 1;
                }
            }
        }
        return x;
    }

    /**
     * Rotates a hex number by a specified value
     *
     * @param x the hex representation of "12345678"
     * @param n with how much places to rotate left our hex
     */
    public static void rotate_left(int x, char n) {
        System.out.println("  12345678 with left rotate by: " + (int) n);

        System.out.printf("new hex: " + "%08x%n", Integer.rotateLeft(x, n));

    }
}
