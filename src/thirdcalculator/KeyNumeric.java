/* 
 */
package thirdcalculator;

/**
 * KeyNumeric is the class of numeric keys of the calculator. It/ the objects
 * created has a STATIC field called counter it will increase from 0 by 1 each
 * time a new object is instantiated. thus, each object will be marked from 0 to
 * ... TheCalculator will create 10 objects KeyNumeric class will have a
 * method/behaviour: it will add something [or not] to screen, depending on the
 * "input" that indicates whether the key is "pressed" or not
 */
class KeyNumeric {

    private final int label; // the key has a label on it
    private static int counter = 0; // this is STATIC [class field] used to generate the labels of KeyNumeric objects

//here it is the standard procedure to generate consecutive IDs for the elements of a class
    protected KeyNumeric() {
        label = counter;
        counter++;
    }
// the button has its method (Action): it adds/concatenate its label (which is an int, but we convert it to a string) 
// to its second argument (which is a string); 
// and returns the result of the concatenation

    String action(char input, String screen) {

        if (Integer.toString(label).equals(Character.toString(input))) {
            screen = screen + Integer.toString(label);

        }
        return screen;
    }

}
