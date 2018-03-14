/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestdatecs;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import static javatestdatecs.TLV.hexToDecimal;

/**
 * Main class Created methods for each java starter exercise and binary
 * exercises in main method we have tests to run each separate exercise
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
        //---------------New edit 13.03.2018 ex Seven rotate Left
//        String number = "12345678";
//        int rotateBy = 2;
//        System.out.printf("new hex: " + "%08x%n", bitwise_rotate_left(number, rotateBy));
        //----------------------BINARY NOTATION EX SIX 13.03.2018

        //System.out.println(isBitSet(15, "A"));
        //    System.out.println(MSB(7));
        //System.out.println(countSetBits(15));
//        //----------------------BINARY NOTATION EX SIX A, D 14.03.2018
//      // BINARY SIX A - 5 has zeros = return true
        int a = 255;
        System.out.println("zeros in 255 :1111 1111: " + (binarySixA(a) > 0));
        // BINARY SIX A - 15 has no zeros = return false
        int x = 115;
        System.out.println("zeros in 115 :0111 0011: " + (binarySixA(x) > 0));

        //-----------BINARY SIX B 
        System.out.println("1's in 155 :0111 0011: " + (binarySixB(x) > 0));
        System.out.println("1's in 0 :0: " + (binarySixB(0) > 0));

        //-----------BINARY SIX C 
        System.out.println("get lsb from 2555: " + getLSB(2555));
        System.out.println("get number of 1 bit's in 2555 LSB " + (binarySixB(getLSB(2555)) > 0));
        //--------------------BINARY SIX D
        //use helper method for binary six A to get number of zeros
        //and if any bit is 0 
        System.out.println("test if zeros " + (binarySixA(shiftMSB(14)) > 0));
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

    //---------------New edit 13.03.2018
//------------------------------BINARY NOTATION 14.03.2018----------------------
    static int binarySixA(int x) {

        //if x is equal to zero return 0;
        if (x == 0) {
            return 0;
            /**
             * else check if NOT x and 1 is equal to 1 then recurse shifting 1
             * bit right e.g x = 15 = 1111 NOT x = 0000 x AND 1 would give
             * result back 0 meaning there are no ZEROS in the integer. if x =
             * 14 = 1110 not x == 0001 and b1 of x(1) and 1 would be 1 meaning 1
             * * zero present
             */
        } else {
            return (~x & 1) + binarySixA(x >> 1);
        }
    }

    static int binarySixB(int x) {

        //if x is equal to zero return 0;
        if (x == 0) {
            return 0;
            /**
             * else check if x and 1 is equal to 1 then recurse shifting 1 bit
             * right e.g x = 15 = 1111 AND 1 would give result back 1 meaning
             * there are bit 1's in the integer.
             */
        } else {
            return (x & 1) + binarySixA(x >> 1);
        }
    }

    //---------------------BINARY SIX D helper method
    public static int shiftMSB(int x) {
        //check length of x in binary
        int length = Integer.toBinaryString(x).length();
        /*
        if length is bigger than 8, recurse the method shfiting 1 bit to the right
        meaning that we are going to shift until we have up to 8 bits 
        which is going to be the most significant byte 
        
         */
        if (length > 8) {
            return shiftMSB(x >> 1);
        } else {
            return x;
        }
    }
    // and any number with 255-  would return the last 8 bits

    public static int getLSB(int x) {
        return x & 255;
    }

    /**
     * Rotates a hex number by a specified value
     *
     * @param x the hex representation of "12345678"
     * @param bits with how much places to rotate left our hex
     * @return the number in decimal after rotating bits
     */
    public static int bitwise_rotate_left(String x, int bits) {
        //convert hex to decimal for bitwise rotating
        int xDec = hexToDecimal(x);
        return (xDec << bits) | (xDec >> (32 - bits));

    }

    //method to get a string hex and return decimal value
    public static int hexToDecimal(String display) {
        //parse the string to integer then transform from 16 bit
        int decimal = Integer.parseInt(display.trim(), 16);
        // System.out.println(display + ", to decimal: " + decimal);
        return decimal;
    }
    //---------------New edit 13.03.2018

}
