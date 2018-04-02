/*
  * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author QUEEN
 */
public class RoadTrip {
    public static void main (String [] args){
        
        final double NEDS_MILES_PER_GALLON = 32.0;
        final double AVERAGE_GAS_PRICE = 2.65;
        // declaring and initializing ariables
        String carMake = "1996 Mada Protege";
        String carName = "Nedfry";
        int maxPassengers = 5; // primitive type variable
        int currentNumberOfPassengers = 1;
        boolean carFull = false;
        double tripOdometer = 0.0;
        double tripBudget = 300.00;
        double distanceToMoabUtah = 1806;
        boolean destinationReached = false;
        
        double legDistance; // declaring this variable but not initalizing
        
        // simulation of the roadtrip
     System.out.println("***Road trip simulator***");
        // print out initial stats
     System.out.println("-->Beginning of trip stats <--");
     System.out.println("Make of car:" + carMake + "that can carry:" + maxPassengers);
     System.out.println("The car's name is" + carName);
     System.out.println("Distance to Destination:" + distanceToMoabUtah);
     System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
     System.out.println("I have $ " + tripBudget + "to spend on this trip");
     System.out.println("Starting trip with" + currentNumberOfPassengers + "Passenger");
     System.out.println("Destination Reached? " + destinationReached);
     System.out.println("***********************");
   
        
System.out.println();
System.out.println("Begining leg 1: ");

// calculate leg distance 25% of total trip, store in legDistance
double decimalofOneQuarter = .25;
legDistance = distanceToMoabUtah * decimalofOneQuarter;
System.out.println("Check leg distance: " + legDistance);

// increment trip odometer by leg distance, over-write odometer
tripOdometer = tripOdometer + legDistance;

//subtract leg distance from distanceTo destination, over write distance
distanceToMoabUtah = distanceToMoabUtah - legDistance;

// "see" hitch hicker heading West
System.out.println("Oh, look! A person who wants to go west, too!");

// check if ther is room in the car, if so, pick up hitch hiker
if(carFull == false){
    System.out.println("Car is not full, picking up hitcher");
    currentNumberOfPassengers = currentNumberOfPassengers + 1;
    // alternative shorter version: currentNumberOFPassengers++
} // closes if ()

// calculate price of gas for first leg and store in temp variable
//gas price = (distance/milesPerGallon) * price per gallon
double gasPriceForLeg = (legDistance/ NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
// deduct $ spent on gas from money remaining and over-write cashOnHand
tripBudget = tripBudget - gasPriceForLeg;

// reprint the variables that were adjusted
System.out.println("***Variable stats at end of the leg 1***");
        System.out.println("Distance to Drstination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + ", Current odometer:" + tripOdometer);
        System.out.println("I have $ " + tripBudget + "to spend on this trip");
        System.out.println(currentNumberOfPassengers + "Passengers in car");
        System.out.println("Destination Reached? " + destinationReached);

        // Solution to exercise for completing road trip
        
// Step 1 leg distance
        legDistance = 500;
        
// Step 2 2 pair of hitchhikers are picked up
        System.out.println("2 more hitchhikers, Should we pick them up?");
        if(carFull == false){
            System.out.println("Hurry in guys before I come to my sense's");
            currentNumberOfPassengers = currentNumberOfPassengers + 2;           
}
        
 // Step 3 Calculate gas prices for 500 miles
 gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
 tripBudget = tripBudget - gasPriceForLeg;
 System.out.println("Amount spent on gas leg 2: " + gasPriceForLeg);
 
// step 4: print out leg two  

System.out.println();
System.out.println("***Variable stats at end of the leg 2***");
System.out.println("Distance to Destination: " + distanceToMoabUtah);
System.out.println("Full Car? " + carFull + ", Current odometer:" + tripOdometer);
System.out.println("I have $ " + tripBudget + "to spend on this trip");
System.out.println(currentNumberOfPassengers + "Passengers in car");
System.out.println("Destination Reached? " + destinationReached);

// Step 5 Get remaining distance to utah as leg distance
legDistance = distanceToMoabUtah - legDistance;

// Step 6 more hitchhikers
System.out.println ("There sure are a lot of hitchhikers!");
        if(carFull == false){
            System.out.println("Sorry guys we are packed like a clown car!");
            currentNumberOfPassengers = currentNumberOfPassengers + 0; 
// Step 7: pay for gas for rest of trip
gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
tripBudget = tripBudget - gasPriceForLeg;
System.out.println("Cash paid for gas on final leg: " + gasPriceForLeg);

// Step 8 arrive! and toggle destination reaced var
destinationReached = true;

// Step 9: Print out final stats:

System.out.println();
System.out.println("***Variable stats at end of the leg 3***");
System.out.println("Distance to Destination: " + distanceToMoabUtah);
System.out.println("Full Car? " + carFull + ", Current odometer: " + tripOdometer);
System.out.println("I have $ " + tripBudget + "to spend on this trip");
System.out.println( currentNumberOfPassengers + "Passengers in car");
System.out.println("Destination Reached? " + destinationReached);
}// close class main
}// close class RoadTrip
}