/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymethods;

/**
 *
 * @author ernst
 */
public class MyMethods {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
    }    // main methos does NOTHING 
    
    
    // this is the first method i need in secondsalculator [can be used anywhere though]
    public static void calculate(int a, int b) {
    int product,remainder,gcd,lcm;
    
    product=a*b;
    
    if (a<b) {
       remainder=a; //i inter-change the input values of a with b
       a=b; // in order to have a>b
       b=remainder;
    }
    
    do {
        remainder=(a % b);
        a=b;
        b=remainder;
    } while (b!=0);
    gcd=a;
    lcm=product/gcd;
              System.out.println("the greatest common divisor is " + (gcd));
              System.out.println("the least common multiplier is " + (lcm));

    }
}