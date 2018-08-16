/*
 * 
 */
package ultimatecalculator;

/**
 *
 *
 */
public class KeyEqual extends Key {

    protected KeyEqual() {
        this.label = '=';
    }

    @Override
    String screenMeth(char input, String screen, String memory, char operator) {
            if (input == label) {
            switch (operator) {
                case '+':
                    screen = String.valueOf(Float.parseFloat(memory) + Float.parseFloat(screen));
                    break;
                case '-':
                    screen = String.valueOf(Float.parseFloat(memory) - Float.parseFloat(screen));
                    break;
                case '*':
                    screen = String.valueOf(Float.parseFloat(memory) * Float.parseFloat(screen));
                    break;
                case '/':
                    screen = String.valueOf(Float.parseFloat(memory) / Float.parseFloat(screen));
                    break;
            }
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
