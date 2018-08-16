/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringandnumber;

import java.util.Scanner;

/**
 *
 * @author ernst
 */
public class Initials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner xerox = new Scanner(System.in);
        System.out.println("Please input yout full name");
        String name = xerox.nextLine();

        String[] strArray = name.split(" ");
        for (String strArray1 : strArray) {
            System.out.println(strArray1.charAt(0));
        }

    }
}
