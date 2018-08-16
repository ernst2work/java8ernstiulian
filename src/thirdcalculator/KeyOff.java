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
class KeyOff {

    private final String label = "OFF";

    String off(char input, String screen) {
        if (input == label.charAt(0)) {
            screen = "OFF";
        }

        return screen;

    }
}
