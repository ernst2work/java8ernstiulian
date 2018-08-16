/*
 * 
 */
package ultimatecalculator;

import java.util.Scanner;

/**
 *
 */
public class UltimateCalculator {

    private String screen = ""; // the calculator has a screen; i created it here as a String
    private String memory; // the calculator has a numeric memory to store numbers
    private char operator; // the calculator has a memory to store the operation it is "told" to do

// here there are the keys of the calculator, which are instances of the classes found in same package
    KeyZero keyZero = new KeyZero();
    KeyOne keyOne = new KeyOne();
    KeyTwo keyTwo = new KeyTwo();
    KeyThree keyThree = new KeyThree();
    KeyFour keyFour = new KeyFour();
    KeyFive keyFive = new KeyFive();
    KeySix keySix = new KeySix();
    KeySeven keySeven = new KeySeven();
    KeyEight keyEight = new KeyEight();
    KeyNine keyNine = new KeyNine();
    KeyDot keyDot = new KeyDot(); // this is for the decimal point 

    KeyPlus keyPlus = new KeyPlus(); // here are the keys for the operations
    KeyMinus keyMinus = new KeyMinus();
    KeyDivi keyDivi = new KeyDivi();
    KeyMulti keyMulti = new KeyMulti();

    KeyEqual keyEqual = new KeyEqual(); // this is the @core key@ of the calculator: it has the method that CALCULATES
    
    KeyClear keyClear = new KeyClear(); // to clear the screen

    KeyOff keyOff = new KeyOff(); // to turn off the calculator
   
    private void operate() {
        Scanner xerox = new Scanner(System.in); // i need to read input
        char input; // the calculator receives inputs as characters
// here it starts the cycle that reads the input [characters] one by one and passes them 
// TO EACH KEY's methods so that they can behave accordingly [numeric keys write on screen, and so on...
// in each loop, THERE IS A PRINT command at the end, so that the message on the screen is always visible
        do {
            input = xerox.next().charAt(0);

            screen = keyZero.screenMeth(input, screen, memory, operator); // each numeric key has the screenMeth method
            screen = keyOne.screenMeth(input, screen, memory, operator); // the other methods of numeric keys do nothing
            screen = keyTwo.screenMeth(input, screen, memory, operator);
            screen = keyThree.screenMeth(input, screen, memory, operator);
            screen = keyFour.screenMeth(input, screen, memory, operator);
            screen = keyFive.screenMeth(input, screen, memory, operator);
            screen = keySix.screenMeth(input, screen, memory, operator);
            screen = keySeven.screenMeth(input, screen, memory, operator);
            screen = keyEight.screenMeth(input, screen, memory, operator);
            screen = keyNine.screenMeth(input, screen, memory, operator);
            screen = keyDot.screenMeth(input, screen, memory, operator);

            operator = keyPlus.operatorMeth(input, screen, memory, operator); //methods of keyPlus
            memory = keyPlus.memoryMeth(input, screen, memory, operator);
            screen = keyPlus.screenMeth(input, screen, memory, operator);

            operator = keyMinus.operatorMeth(input, screen, memory, operator); //methods of keyMinus
            memory = keyMinus.memoryMeth(input, screen, memory, operator);
            screen = keyMinus.screenMeth(input, screen, memory, operator);

            operator = keyMulti.operatorMeth(input, screen, memory, operator); //methods of keyMulti[plication]
            memory = keyMulti.memoryMeth(input, screen, memory, operator);
            screen = keyMulti.screenMeth(input, screen, memory, operator);

            operator = keyDivi.operatorMeth(input, screen, memory, operator); //methods of keyDivi [divide]
            memory = keyDivi.memoryMeth(input, screen, memory, operator);
            screen = keyDivi.screenMeth(input, screen, memory, operator);

            screen = keyEqual.screenMeth(input, screen, memory, operator);
            screen = keyClear.screenMeth(input, screen, memory, operator);

            screen = keyOff.screenMeth(input, screen, memory, operator);

            System.out.println(screen);

        } while ((input != 'O') && (screen.length() < 12)); //this is in order to prevent too long inputs
    }
// here it is the main method that starts/initiates the operation of the desk calculator 
    
        public static void main(String... args) {
        UltimateCalculator myCalculator
                = new UltimateCalculator();
        myCalculator.operate();
    }
    
}
