/*
 * 
 */
package ultimatecalculator;

/**
 *
 * 
 */
public class KeyDot extends Key {

    protected KeyDot() {
        this.label = '.';
    }

    @Override
    String screenMeth(char input, String screen, String memory, char operator) {
     
        if (label == input) {
            screen = screen + Character.toString(label);
        }        
    return screen;
    }

    @Override
    String memoryMeth(char input, String screen, String memory, char operator) {
    return memory;
    }

    @Override
    char operatorMeth(char input, String screen, String memory, char operator) {
    return operator;
    }
    
}
