/*
 * Demonstrates Java's primitive type and String tupe variables
 *and essential operators to manipulate those variables
*/

/**
 *
 * @author QUEEN
 */
public class Variables {
    
    public static void main (String [] args) {
        //declare varibles and give them a type (they are all int type)
        int yearsEleSchl;
        int yearsMS;
        int yearsHS;
        int yearsCollege;
        int totalYears;
        
        // now intitialize them with a value
        yearsEleSchl = 5;
        yearsMS = 3;
        yearsHS = 4;
        yearsCollege = 2;
        totalYears = yearsEleSchl + yearsMS + yearsHS + yearsCollege;
        
        // and print the value of totalYears to the console with some text
        System.out.println("Total years in school: " + totalYears);
        
    }// close main method
}// close clas Variables
