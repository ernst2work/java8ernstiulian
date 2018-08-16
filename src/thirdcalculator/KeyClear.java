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
class KeyClear {

    private final char label = 'C';

    String clearScreen(char input, String screen) {
        if (input == label) {
            screen = "";
        }
        return screen;
    }
}
