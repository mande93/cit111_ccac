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
public class OperatorsChallenge {
    public static void main (String [] ags){
        int a = 100;
        int b = 2000;
        double d = 10.5;
        String line1 = "Go ask Alice";
        String line2 = "I think she'll know";
        
        int r = b/a;
        System.out.println ("varibale r is: " + r);
        
        int mod = b % a;
        System.out.println ("b % a is: " + mod);
        
        double rd = mod * d;
        System.out.println ("module divides and gives remainder: " + rd);
        
        a= a + 5;
        System.out.println ("i'm about to compute" +  b + "mod" + a);
        
        rd = b % a;
        System.out.println("Module operator divides and gives remainder:" + rd);
        
        System.out.println(line1);
        System.out.println(line2);
        System.out.println("combined:" + line2 + " " + line1);
        System.out.println("Or is it" + line1 + " " + line2);
        
        
    }
}
