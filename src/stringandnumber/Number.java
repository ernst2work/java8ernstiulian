package stringandnumber;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ernst
 */
public class Number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int counter = 0; counter < 10000; counter++) {

            short randomNumber = (short) (Math.random() * 10 % 6 + 1);

            System.out.println(randomNumber);
        }

    }

}
