/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestdatecs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class TLV {

    static String tag, tagLength, value;
    static int lenDecimal;
    static HashMap<String, String> dataParsed = new HashMap<>();
    static int count = 0, mount = 0;
    static ArrayList<ArrayList<String>> myList = new ArrayList<>();

    public static void main(String[] args) {
//        System.out.println("hex 61 to bin " + hexToBinary("5f"));
//        System.out.println("most significant");
//        System.out.println(mostSignificantBit("61"));
//        System.out.println(mostSignificantBit("87"));
//        System.out.println(mostSignificantBit("9F"));

        String inputOne = "61 1F 4F 08 A0 00 00 00 25 01 05 01 50 10 50 65 72 73 "
                + "6F 6E 61 6C 20 41 63 63 6F 75 6E 74 87 01 01";

        String inputTwo = "61 1E 4F 07 A0 00 00 00 29 10 10 50 10 50 65 72 73 6F "
                + "6E 61 6C 20 41 63 63 6F 75 6E 74 87 01 02";

        String inputThree = "77 22 82 02 78 00 94 1C 10 01 04 00 10 05 05 00 08 06 "
                + "06 01 08 07 07 01 08 08 09 01 08 0A 0A 00 08 01 04 00";

        String inputFour = "77 1E 9F 27 01 80 9F 36 02 02 13 9F 26 08 2D F3 83 3C 61"
                + " 85 5B EA 9F 10 07 06 84 23 00 31 02 08";

        String inputFive = "6F3D840E325041592E5359532E4444463031A52"
                + "BBF0C28610C4F07A0000000041010870101610C4F07A000000"
                + "0043060870103610A4F05B012345678870109";

        String inputSix = "BF0C28610C4F07A0000000041010870101610C4F07A0000000043060870103610A4F05B012345678870109";
//
        //    BerTlv(inputFive);
        //  System.out.println("DATA\n" + dataParsed);
        //   System.out.println("\n");
        BerTlv2(inputFive);
//        System.out.println("DATA\n" + dataParsed);
        System.out.println("test " + mostSignificantBit("87"));

        System.out.println("\n" + myList);
        String temp = "A5";
        System.out.println("IsConstructed :" + temp + "  " +isConstructed(temp));

    }

    //method to get a string hex and return decimal value
    public static int hexToDecimal(String display) {
        //parse the string to integer then transform from 16 bit
        int decimal = Integer.parseInt(display.trim(), 16);
        // System.out.println(display + ", to decimal: " + decimal);
        return decimal;
    }

    public static String hexToBinary(String hexString) {
        int i = Integer.parseInt(hexString, 16);
        String binaryString = Integer.toBinaryString(i);
        String padded = String.format("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        return padded;
    }

    public static boolean mostSignificantBit(String binary) {
        //System.out.println(Integer.parseInt("01"));
        int temp = hexToDecimal(binary);
        int msb = ((byte) temp & 0x1F);

        return msb == 0x1f;
    }
    
    public static boolean isConstructed(String binary){
        int temp = hexToDecimal(binary);
        int isCon = ((byte)temp & 0x1f);
        
        return isCon == 0x1f;
    }

    public static void BerTlv(String input) {
        ArrayList<String> item = new ArrayList<>();
        //  System.out.println("Count is: " + count);
        //if input not empty and count not equal to input's length continue
        if (!input.equals("") && count != input.length()) {
            //delete all spaces betweeen the input's bytes
            input = input.replaceAll("\\s+", "");
            //get the tag to be a substring of our input from 0 to 2
            tag = input.substring(count, count + 2);
            //if tag's most significant bit equal to 1 the tag also contains the next byte
            //else continue with just 1 
            if (mostSignificantBit(tag.substring(0, 2))) {
                tag = input.substring(count, count + 4);
                count += 4;
                tagLength = input.substring(count, count + 2);

            } else {
                count += 2;

                tagLength = input.substring(count, count + 2);

                //System.out.println("Tag is: " + tag);
                // System.out.println("tagLength is: " + tagLength);
                //    System.out.println("count after add" + count);
            }

            //for the first tag dont add a value string in the hash map
            if (count < 5) {

                item.add(tag + "(" + hexToDecimal(tagLength) + ")");
                item.add("");
                myList.add(item);
                dataParsed.put(tag + "(" + hexToDecimal(tagLength) + ")", "");
                count += 2;

                System.out.println("Tag: " + tag + " length " + tagLength + " value is :" + " ");

            } else {

                value = input.substring(count + 2, hexToDecimal(tagLength) * 2 + count + 2);

                item.add(tag + "(" + hexToDecimal(tagLength) + ")");
                item.add(value);
                myList.add(item);

                dataParsed.put(tag + "(" + hexToDecimal(tagLength) + ")", value);
                count += (value.length() + 2);

                System.out.println("Tag: " + tag + " length " + tagLength + " value is :" + value);

            }
            //   System.out.println("\ndataFromApp:" + dataParsed + "\n" );
            BerTlv(input);
        }

    }

    public static void BerTlv2(String input) {
        ArrayList<String> item = new ArrayList<>();
        //  System.out.println("Count is: " + count);
        //if input not empty and count not equal to input's length continue
        if (!input.equals("") && mount != input.length()) {
            //delete all spaces betweeen the input's bytes
            input = input.replaceAll("\\s+", "");
            //get the tag to be a substring of our input from 0 to 2
            tag = input.substring(mount, mount + 2);
            //if tag's most significant bit equal to 1 the tag also contains the next byte
            //else continue with just 1 
            if (mostSignificantBit(tag.substring(0, 2))) {
                tag = input.substring(mount, mount + 4);
                mount += 4;
                tagLength = input.substring(mount, mount + 2);
            } else {
                mount += 2;
                if (mount == input.length()) {
                    return;
                } else {
                    tagLength = input.substring(mount, mount + 2);
                }
            }
            value = input.substring(mount + 2, hexToDecimal(tagLength) * 2 + mount + 2);
            //  System.out.println("m " + mount);
            //dataParsed.put(tag + "(" + hexToDecimal(tagLength) + ")", value);
            if (mount + (value.length() + 2) == input.length() && mount < 5) {

                mount += 2;
                value = "";

            } else {
                //   System.out.println("VLEZE");
               
                    mount += (value.length() + 2);
                
            }
            item.add(tag + "(" + hexToDecimal(tagLength) + ")");
            item.add(value);
            myList.add(item);
            System.out.println("Tag: " + tag + " length " + tagLength + " value is :" + value);
            BerTlv2(input);

        }
    }
}
