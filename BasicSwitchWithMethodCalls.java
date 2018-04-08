/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.util.Scanner;
import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author QUEEN
 */
public class BasicSwitchWithMethodCalls {
    public static void main (String [] args){
        Scanner keyboardScanner =  new Scanner (System.in);
        int SELECTOR;
    
    System.out.println("****Switches and Methods***");
    System.out.println("Options: ");
    System.out.println("1 - Print a special statement");
    System.out.println("2 - Generate a really big random number");
    System.out.println("3 - Get me out of here!");
    System.out.println("Enter an int and press Enter");
    
    SELECTOR = keyboardScanner.nextInt();
}
    {
        
        // a hard-coded value to test switch functionality
        final int SELECTOR = 78;
        
        // match the value of SELECTOR to a case's value and execute the code
        // in that case until a break; is encountered
        if (SELECTOR == 1){
                System.out.println("First case selected");
        } else if (SELECTOR == 2){
                System.out.println("Second case selected");
        } else if (SELECTOR == 78){
                System.out.println("Case can match any int value");
            // any pass through this switch which doesn't match a case hits here
        }else {
                System.out.println("Default case");
        } //close if/else
    } // close main
        
    
    // illustrataion method that takes no parameters and returns nothing to the caller
    public static void printStatement(){
        System.out.println("****INSIDE printStatement*****");
        System.out.println ("Statement: Where There's a Will. There's a Way");
        System.out.println("*************************************");
        generateBigInteger();
        
    } //close method printSpecialStatement
    
    public static void generateBigInteger(){
        System.out.println("*****INSIDE generateBigNumber*****");
        //create a friendly random number generator
        Random r = new Random();
        // create an object to do math with huge numbers
        BigInteger bigInt = new BigInteger(100, r);
        // display th randomly generated huge number
        System.out.println(bigInt);
        System.out.println("********************");
    }
} //close class

