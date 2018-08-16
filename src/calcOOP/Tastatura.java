/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcOOP;

/**
 *
 * @author ernst
 */
import java.util.Scanner;

class Tastatura {

    char input;

 void entry() {
        Scanner xerox = new Scanner(System.in);
//        do {

input = xerox.next().charAt(0);
//            System.out.print(input);
//        } while ((input != 'O'));

    }

    public char getInput() {
        return input;
    }

}
