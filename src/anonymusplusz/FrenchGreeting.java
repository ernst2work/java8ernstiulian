/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymusplusz;

/**
 *
 * @author ernst
 */
// create a class that greets in French language
public class FrenchGreeting {

    String name = "tout le monde";

    public void greet() {
        greetSomeone("tout le monde");
    }

    public void greetSomeone(String quelque) {
        name = quelque;
        System.out.println("Salut" + name);
    }
} // end of FrenchGreeting class        

