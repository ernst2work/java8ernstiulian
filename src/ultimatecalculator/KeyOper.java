/*
 * 
 */
package ultimatecalculator;

/**
 *
 *
 */
public class KeyOper extends Key {

    @Override
    String screenMeth(char input, String screen, String memory, char operator) {
        if (input == label) {
            screen = "";
        }
        return screen;
    }

    @Override
    String memoryMeth(char input, String screen, String memory, char operator) {
        if (input == label) {
            memory = screen;
        }
        return memory;
    }

    @Override
    char operatorMeth(char input, String screen, String memory, char operator) {
        if (input == label) {
            operator = input;
        }
        return operator;
    }

}
