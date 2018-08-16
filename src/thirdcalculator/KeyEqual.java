/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdcalculator;

/**
 *
 * @author ernst
 */
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
