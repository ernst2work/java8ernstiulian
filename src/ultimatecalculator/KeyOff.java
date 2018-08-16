/*
 * 
 */
package ultimatecalculator;

/**
 *
 *
 */
public class KeyOff extends Key {

    protected KeyOff() {
        this.label = 'O';
    }

    @Override
    String screenMeth(char input, String screen, String memory, char operator) {
        if (input == label ) {
            screen = "OFF";
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