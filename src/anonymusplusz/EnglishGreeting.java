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
// Create a class that greets in English language
public class EnglishGreeting {

    String name = "world";

    public void greet() {
        greetSomeone("world");
    }

    public void greetSomeone(String someone) {
        name = someone;
        System.out.println("Hello " + name);
    }
} // end of EnglishGreeting class

