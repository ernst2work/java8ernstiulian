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
public class AnonymusPlusz {

// create an EnglishGreeting object/instance
    EnglishGreeting englishGreeting = new EnglishGreeting();
// create a FrenchGreeting object/instance
    FrenchGreeting frenchGreeting = new FrenchGreeting();
// create a SpanishGreeting object/instance
    SpanishGreeting spanishGreeting = new SpanishGreeting();

// main method
    public static void main(String[] args) {
        AnonymusPlusz myApp
                = new AnonymusPlusz();
        myApp.sayHello();
    }

    public void sayHello() {
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fredo");
        spanishGreeting.greet();
    }

}
