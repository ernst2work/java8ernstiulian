/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcUML;

import java.util.Scanner;

/**
 * This class holds the main class of the package The main method "manipulates"
 * [pushes keys of ] an instance of the Frame class -- -- which is the class
 * that resembles simple [binary operations only] desk calculators. This class
 * has only one method [main] and no other members.
 *
 * @author ernst
 */
public class OOPCalculator {

    /**
     * @param args the command line arguments
     */
    static Frame calculator = new Frame();

    public static void main(String[] args) {

        Scanner xerox = new Scanner(System.in);
        String stateCalcu = null;

        do {
            char input;
            calculator.ecran.displayPrint("Please push key");
            input = xerox.nextLine().charAt(0);

            for (int k = 1; k <= 15; k++) {
                if (input == calculator.butoane[k].keyToChar()) {
                    calculator.butoane[k].pushState = true;
                    calculator.setKeyInput(input);

 
                }
            }

        } while (!"off".equals(stateCalcu));

    }

}
