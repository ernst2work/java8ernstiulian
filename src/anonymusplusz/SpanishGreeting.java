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
// create a class that greets in Spanish language
public class SpanishGreeting {

    String name = "mundo";

    public void greet() {
        greetSomeone("mundo");
    }

    public void greetSomeone(String someoneSpanish) {
        name = someoneSpanish;
        System.out.println("Hola " + name);
    }
} // end of SpanishGreeting class        
