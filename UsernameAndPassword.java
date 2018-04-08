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
public class UsernameAndPassword {
    public static void main (String[] args) {
     
      final String CORRECT_USERNAME = "javaghost";
      final String CORRECT_PASSWORD = "ic0d3";
      
    //stored variables 
    String enteredUsername;
    String enteredPassword;
    //create scanner object
    Scanner userInputScanner = new Scanner(System.in);
    //screen to enter username
    System.out.println("Please enter yout username then click enter");
    enteredUsername = userInputScanner.next();
    System.out.println("Enter yout password then click enter");
    enteredPassword = userInputScanner.next();
    //code to check if username and password are correct
    if (enteredUsername.equals(CORRECT_USERNAME) & enteredPassword.equals (CORRECT_PASSWORD)){
        //information correct
        System.out.println("Access Granted!");
    } else{
        System.out.println("Access Denied!!");
    }// close if/else blocks
}// close main
}// close class