/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;
import static week6.computePriceAfterDiscount.computePriceAfterDiscount;

/**
 *
 * @author QUEEN
 */
public class PurchaseCalculator {
    
    public static void main (String [] args) {
        // we would ordinarily declare this constant in class scope
        // staty tuned for next wek"s module
        final double ITEM_PRICE = 100.00;
        double discount = 0.15;
        double purchaseLimit;

        System.out.println("Hard coded price value: $" + ITEM_PRICE);
        System.out.println("Enter purchase limit and press enter ");
        
        Scanner s = new Scanner(System.in);
        purchaseLimit = s.nextDouble();
        // call method and pass in a double value as the declaration requires
        System.out.println("Price of item with tax: ");
        
        displayPriceWithTax(ITEM_PRICE);
        
        // copied from key
        double perc = discount * 100;
        System.out.println("Hard-coded discount of %" + perc);
        
        computePriceAfterDiscount(ITEM_PRICE, discount);
        displayPurchasableNumber(ITEM_PRICE, purchaseLimit);
    } // close main method
    
    public static void displayPriceWithTax(double price){
        // this would normally be in the class scope (not inside any method)
        final double TAX_RATE = 0.075;
        // compute price + tax
        double totalPrice = price * (1 + TAX_RATE);
        System.out.println("Total price with tax: $" + totalPrice);
    } // close method displayPriceWithTax

public static void displayPurchasableNumber(double price, double limit){
    int numPurchasable = (int) Math.floor(limit / price);
    System.out.println("With $" + limit + " , you can buy" + numPurchasable + 
        " units");
}
}// close class

