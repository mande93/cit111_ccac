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
public class SpeedEnforcement {
 
    
    public static void main (String [] args){
        
    // set the speed limits
    final int MAX_SPEED_LIMIT = 55;
    final int MIN_SPEED_LIMIT = 25;
    // create a double-type variable to store rider's height
    int vehicleSpeed;
    // create a Scanner object for care speed from user
    Scanner userInputScanner = new Scanner(System.in);
    
    //Driver's speed
    System.out.println("Enter speed of vehicle in mph and press Enter: ");
    // read whatever the user tped on the keyboard into the variable riderHeight
    vehicleSpeed = userInputScanner.nextInt();
    
    // compare the entered speed against the minimum height
    if(vehicleSpeed < MIN_SPEED_LIMIT){
        // code to run if driving below the min limit
        System.out.println("Gotta pick up the speed Daisy");
    
    } else if (vehicleSpeed > MAX_SPEED_LIMIT) {
        // code to run if driving witin limits
        System.out.println("SLOW DOWN SPEEDY!!!");
    }else {
          System.out.println("You are doing great watching your speed");
    } // close if/else blocks
    }// close main method
    
}// close class SpeedEnforment
