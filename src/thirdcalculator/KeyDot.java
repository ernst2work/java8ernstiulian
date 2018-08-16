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
class KeyDot {
    private final char label = '=';
    String Action(char input, String screen) {

        if (input == label) {
            screen = screen + ".";

        }
        return screen;
    }

}
