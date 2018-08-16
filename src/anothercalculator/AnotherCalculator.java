/*
 */
package anothercalculator;

import java.util.Scanner;

/**
 * This is the class of desk calculators [where a specific desk calculator is
 * built as well]; The desk calculator is formed by a screen [string], numeric
 * memory [numMemory string], a memory to store the operand [operMemory] and
 * keys (many keys): numeric Keys, keys for operations +,-,*,/ , a "=" key and
 * an "OFF" key.
 *
 * Each key is an instance of INNER CLASSES. the calculator itself is
 * instantiated in the main method [at the bottom], which is used to call the
 * other method of the class: operate.
 *
 * the method operate includes a loop used to read input. each key runs its
 * method[s] where the input is an argument: the numeric keys add digits to the
 * screen [or the decimal point], operation keys store the specific operation in
 * the operMemory and the screen string to numMemory and cleans the screen [so
 * that the next number is introduced by the user. equal key has methods to
 * calculate the outcome and store it in/on the screen. another calculation can
 * be initiated from the outcome of the first operation [just as in the case of
 * a desk calculator].
 *
 * there is an off button to exit the loop.
 */
public class AnotherCalculator {

    private String screen = ""; // the calculator has a screen; i created it here as a String
    private String numMemory; // the calculator has a numeric memory to store numbers
    private char operMemory; // the calculator has a memory to store the operation it is "told" to do

// the calculator has keys, which are instances of the classes found in same package
    static class KeyNumeric {

        private final int label; // the key has a label on it
        private static int counter = 0; // this is STATIC [class field] used to generate the labels of KeyNumeric objects

//here it is the standard procedure to generate consecutive IDs for the elements of a class
        protected KeyNumeric() {
            label = counter;
            counter++;
        }
// the button has its method (action): it adds/concatenate its label (which is an int, but we convert it to a string) 
// to its second argument (which is a string); 
// and returns the result of the concatenation

        String Action(char input, String screen) {

            if (Integer.toString(label).equals(Character.toString(input))) {
                screen = screen + Integer.toString(label);

            }
            return screen;
        }

    }

class KeyDot {
    private final char label = '=';
    String action(char input, String screen) {

        if (input == label) {
            screen = screen + ".";

        }
        return screen;
    }

}

    class KeyPlus {

        private final char label = '+';

        char storeOper(char input, char operMemory) {
            if (input == label) {
                operMemory = input;
            }
            return operMemory;
        }

        String loadMemo(char input, String screen, String numMemory) {
            if (input == label) {
                numMemory = screen;
            }
            return numMemory;
        }

        String clearScreen(char input, String screen) {
            if (input == label) {
                screen = "";
            }
            return screen;
        }
    }

    class KeyMinus {

        private final char label = '-';

        char storeOper(char input, char operMemory) {
            if (input == label) {
                operMemory = input;
            }
            return operMemory;
        }

        String loadMemo(char input, String screen, String numMemory) {
            if (input == label) {
                numMemory = screen;
            }
            return numMemory;
        }

        String clearScreen(char input, String screen) {
            if (input == label) {
                screen = "";
            }
            return screen;
        }
    }

    class KeyDivi {

        private final char label = '/';

        char storeOper(char input, char operMemory) {
            if (input == label) {
                operMemory = input;
            }
            return operMemory;
        }

        String loadMemo(char input, String screen, String numMemory) {
            if (input == label) {
                numMemory = screen;
            }
            return numMemory;
        }

        String clearScreen(char input, String screen) {
            if (input == label) {
                screen = "";
            }
            return screen;
        }
    }

    class KeyMulti {

        private final char label = '*';

        char storeOper(char input, char operMemory) {
            if (input == label) {
                operMemory = input;
            }
            return operMemory;
        }

        String loadMemo(char input, String screen, String numMemory) {
            if (input == label) {
                numMemory = screen;
            }
            return numMemory;
        }

        String clearScreen(char input, String screen) {
            if (input == label) {
                screen = "";
            }
            return screen;
        }
    }

    class KeyEqual {

        private final char label = '=';

        String equate(char input, String screen, String numMemory, char operMemory) {
            if (input == label) {
                switch (operMemory) {
                    case '+':
                        screen = String.valueOf(Float.parseFloat(numMemory) + Float.parseFloat(screen));
                        break;
                    case '-':
                        screen = String.valueOf(Float.parseFloat(numMemory) - Float.parseFloat(screen));
                        break;
                    case '*':
                        screen = String.valueOf(Float.parseFloat(numMemory) * Float.parseFloat(screen));
                        break;
                    case '/':
                        screen = String.valueOf(Float.parseFloat(numMemory) / Float.parseFloat(screen));
                        break;
                }
            }
            return screen;
        }
    }

    class KeyClear {

        private final char label = 'C';

        String clearScreen(char input, String screen) {
            if (input == label) {
                screen = "";
            }
            return screen;
        }
    }

    class KeyOff {

        private final String label = "OFF";

        String off(char input, String screen) {
            if (input == label.charAt(0)) {
                screen = "OFF";
            }

            return screen;

        }
    }
    KeyNumeric keyZero = new KeyNumeric();
    KeyNumeric keyOne = new KeyNumeric();
    KeyNumeric keyTwo = new KeyNumeric();
    KeyNumeric keyThree = new KeyNumeric();
    KeyNumeric keyFour = new KeyNumeric();
    KeyNumeric keyFive = new KeyNumeric();
    KeyNumeric keySix = new KeyNumeric();
    KeyNumeric keySeven = new KeyNumeric();
    KeyNumeric keyEight = new KeyNumeric();
    KeyNumeric keyNine = new KeyNumeric();
    KeyDot keyDot = new KeyDot();

    KeyPlus keyPlus = new KeyPlus();
    KeyMinus keyMinus = new KeyMinus();
    KeyDivi keyDivi = new KeyDivi();
    KeyMulti keyMulti = new KeyMulti();

    KeyEqual keyEqual = new KeyEqual();
    KeyClear keyClear = new KeyClear();

    KeyOff keyOff = new KeyOff();

    private void operate() {
        Scanner xerox = new Scanner(System.in); // i need to read input
        char input; // the calculator receives inputs as characters
// here it starts the cycle that reads input one by one and passes them 
// to each key so that they can do their operations
// in each loop, there is a print command at the end, so that the message on the screen is always known
        do {
            input = xerox.next().charAt(0);

            screen = keyZero.Action(input, screen); // each numeric key has the action method
            screen = keyOne.Action(input, screen);
            screen = keyTwo.Action(input, screen);
            screen = keyThree.Action(input, screen);
            screen = keyFour.Action(input, screen);
            screen = keyFive.Action(input, screen);
            screen = keySix.Action(input, screen);
            screen = keySeven.Action(input, screen);
            screen = keyEight.Action(input, screen);
            screen = keyNine.Action(input, screen);
            screen = keyDot.action(input, screen);

            operMemory = keyPlus.storeOper(input, operMemory); //methods of keyPlus
            numMemory = keyPlus.loadMemo(input, screen, numMemory);
            screen = keyPlus.clearScreen(input, screen);

            operMemory = keyMinus.storeOper(input, operMemory); // methods of keyMinus
            numMemory = keyMinus.loadMemo(input, screen, numMemory);
            screen = keyMinus.clearScreen(input, screen);

            operMemory = keyMulti.storeOper(input, operMemory);
            numMemory = keyMulti.loadMemo(input, screen, numMemory);
            screen = keyMulti.clearScreen(input, screen);

            operMemory = keyDivi.storeOper(input, operMemory);
            numMemory = keyDivi.loadMemo(input, screen, numMemory);
            screen = keyDivi.clearScreen(input, screen);

            screen = keyEqual.equate(input, screen, numMemory, operMemory);

            screen = keyOff.off(input, screen);
            screen = keyClear.clearScreen(input, screen);

            System.out.println(screen);

        } while ((input != 'O') && (screen.length() < 12)); //this is in order to prevent too long inputs
    }
// here it is the main method that starts/initiates the operation of the desk calculator 

    public static void main(String... args) {
        AnotherCalculator myCalculator
                = new AnotherCalculator();
        myCalculator.operate();
    }
}
