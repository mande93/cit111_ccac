/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author QUEEN
 */
public class RideHeight {
    
    // this is the entry point of our program
    public static void main (String [] args){
        
    // set the minimum rider height
    final int MIN_HEIGHT_CM = 80;
    // create a double-type variable to store rider's height
    int riderHeight;
    // create a Scannerobject to get values from the keyboard
    Scanner userInputScanner = new Scanner(System.in);
    
    //Ask the rider their height
    System.out.println("Enter your height in cm and press Enter: ");
    // read whatever the user tped on the keyboard into the variable riderHeight
    riderHeight = userInputScanner.nextInt();
    
    // compare the entered height against the minimum height
    if(riderHeight < MIN_HEIGHT_CM){
        // code to run if the comparison is true-rider is not tall enough
        System.out.println("Sorry keep growing and try again next season");
    
    } else {
        // code to run if the comparison is false
        System.out.println("Your height of " + riderHeight + "cm means you can ride");
    }//close if/else block
    } // close main method
} // close RideHeight
