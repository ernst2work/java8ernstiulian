/*
 */
package ultimatecalculator;

/**
 *
 *
 */
public class KeyClear extends Key {

    protected KeyClear() {
        this.label = 'C';
    }

    @Override
    String screenMeth(char input, String screen, String memory, char operator) {
        if (input == label) {
            screen = "";
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
