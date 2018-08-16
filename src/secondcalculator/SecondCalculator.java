/*
 * scoala informala
 */
package secondcalculator;

import java.util.Scanner; // this is for reading input from keyboard
import mymethods.MyMethods; // this is a method i built in MyMethod class
                            // btw i hope you DOWNLOADED it as well
                            // OR THIS calculator WILL partly NOT WORK
                            // it calculates least common multiplier& stuff

/**
 * @author ernst
 */
public class SecondCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner xerox = new Scanner(System.in);   // creates object  named "xerox" from Scanner class
    
    float a=0; // define and initialise first number/variable==field
    float b=0; // define and initialise second number/variable==field
    String scanFix = "scanfix"; // define a field i use to move scanner's cursor 
                                // might be better ways to deal with this, though :)
    String operator="operator"; // this is the operation the programme will do
                                // the user has to choose the operation
    
    // i will operate a do/while cycle 
    // until i get a valid input for first variable.
    // inside the do/while cycle, 
    // i have placed a try/catch exception handler
    // so that the programe does not end here.
    
    do {
      try {
        System.out.println("Please enter first [non-null] term and press Enter");
        a = xerox.nextFloat();
        System.out.println("Thank you");
        }
      catch (java.util.InputMismatchException e)
      {
      System.out.println("Not fun!");
      scanFix = xerox.nextLine();
      }
    } while (a == 0);  // when valid input is entered, a will no longer be 0
                       // and the cycle will stop, compiler will read lines below
    
        // now i will ask input for the operation to be done
        do {
    System.out.println("INPUT THE OPERATION PLEASE? [+,-,/,X,*,:]");
    System.out.println("For least common multiple and greatest common divisor");
    System.out.println("please input lcm or gcd.");
    System.out.println("[numbers will be rounded!]");
    System.out.println("INPUT THE OPERATION PLEASE: ");
    operator = xerox.next();
    } while (!(operator.equals("+")||
            operator.equals("-") ||
            operator.equals("*") ||
            operator.equals("x") ||
            operator.equals(":") ||
            operator.equals("/") ||
            operator.equals("lcm") ||
            operator.equals("gcd"))); 
    
    // the procedure for the second term of the operation:
    do {
      try {
        System.out.println("Please enter  second [non-null] term and press Enter");
        b = xerox.nextFloat();
        System.out.println("Thank you");
      }
      catch (java.util.InputMismatchException e)
      {
      System.out.println("Not fun!");
      scanFix = xerox.nextLine();
      }
    } while (b == 0);
    
    // by switch/case will pick up the right output:
    switch (operator) {
        case "x":
        System.out.println("a x b = " + (a*b));
        break;
        case "*":
        System.out.println("a x b = " + (a*b));
        break;
        case "/":
        System.out.println("a / b = " + (a/b) );
        break;
        case ":":
        System.out.println("a / b = " + (a/b));
        break;
        case "+":
        System.out.println("a + b = " + (a+b));
        break;
        case "-":
        System.out.println("a - b = " + (a-b) );
                case "lcm":
        MyMethods.calculate(Math.round(a),Math.round(b));           
        break;
                case "gcd":
        MyMethods.calculate(Math.round(a),Math.round(b));                       
        break;
    }
}
}
