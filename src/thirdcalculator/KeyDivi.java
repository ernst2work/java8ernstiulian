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
