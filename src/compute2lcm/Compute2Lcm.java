/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compute2lcm;

import java.util.Scanner;

/**
 *
 * @author ernst
 */
public class Compute2Lcm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner xerox = new Scanner(System.in);   // creates object  named "xerox" from Scanner class    
    //this method calculates the least common multiple (lcm) 
    // and the greatest common divisor (gcd)
    int a=0, b=0; // the input numbers 
    String scanFix = "scanfix"; // define a field i use to move scanner's cursor 
                                // might be better ways to deal with this, though :)
    int m,n,p; // three variables to be used in the calculation algorithm of lcm
    int lcm=0,gcd=0; // the output; i don't necessarily need here
                     // lcm, but i might use the method in other classes [?]

    do {
      try {
        System.out.println("Please enter a non-null integer and press Enter");
        a = xerox.nextInt();
        System.out.println("Thank you");
        }
      catch (java.util.InputMismatchException e)
      {
      System.out.println("Not fun!");
      scanFix = xerox.nextLine();
      }
    } while (a == 0);
    
    // i will do the same for the second variable:
    
    do {
      try {
        System.out.println("Please enter another non-null integer and press Enter");
        b = xerox.nextInt();
        System.out.println("Thank you");
      }
      catch (java.util.InputMismatchException e)
      {
      System.out.println("Not fun!");
      scanFix = xerox.nextLine();
      }
    } while (b == 0);
    
    if (a<b) {
       m=a; //i inter-change the input values of a with b
       a=b; // in order to have a>b
       b=m;
    }
    m=a;
    n=b;
    
    do {
        p=(m % n);
          if (p==0) {
              gcd=n;
              System.out.println("the greatest common divisor is " + (gcd));
              System.out.println("the least common multiplier is " + ((a*b)/gcd));
              break;
          }
        m=(n % p);
          if (m==0) {
              gcd=p;
              System.out.println("the greatest common divisor is " + (gcd));
              System.out.println("the least common multiplier is " + ((a*b)/gcd));
              break;
          }
        n=(p % m);
          if (n==0) {
              gcd=m;
              System.out.println("the greatest common divisor is " + (gcd));
              System.out.println("the least common multiplier is " + ((a*b)/gcd));
              break;
          }        
    } while (gcd==0);
    }
    
}
