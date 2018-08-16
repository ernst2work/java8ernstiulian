/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymuspluss;

/**
 *
 * @author ernst
 */
public class AnonymusPluss {


// main method
    public static void main(String[] args) {
        AnonymusPluss myApp
                = new AnonymusPluss();
        myApp.sayHello();
    }

    public void sayHello() {

// Create a local class that greets in English language
        class EnglishGreeting {

            String name = "world";

            public void greet() {
                greetSomeone("world");
            }

            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        } // end of EnglishGreeting class

// create a local class that greets in French language
        class FrenchGreeting {

            String name = "tout le monde";

            public void greet() {
                greetSomeone("tout le monde");
            }

            public void greetSomeone(String quelque) {
                name = quelque;
                System.out.println("Salut" + name);
            }
        } // end of FrenchGreeting class           

// create a local class that greets in Spanish language
        class SpanishGreeting {

            String name = "mundo";

            public void greet() {
                greetSomeone("mundo");
            }

            public void greetSomeone(String someoneSpanish) {
                name = someoneSpanish;
                System.out.println("Hola " + name);
            }
        } // end of SpanishGreeting class

// create an EnglishGreeting object/instance
    EnglishGreeting englishGreeting = new EnglishGreeting();
// create a FrenchGreeting object/instance
    FrenchGreeting frenchGreeting = new FrenchGreeting();
// create a SpanishGreeting object/instance
    SpanishGreeting spanishGreeting = new SpanishGreeting();
               
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fredo");
        spanishGreeting.greet();
    }

}
