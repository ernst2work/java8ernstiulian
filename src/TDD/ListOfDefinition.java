/*
 * 
 */
package TDD;

import java.util.LinkedList;

/**
 * Program returns the list of definition for a specified collection of figures
 * @author ernst
 */
public class ListOfDefinition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a list of shapes
LinkedList<Shape> listOfShapes = new LinkedList<>();  
//add concrete shapes in the list
Rectangle dr1 = new Rectangle();
Rectangle dr2 = new Rectangle();
Circle cr1 = new Circle();
Triungle tr1 = new Triungle();
Triungle tr2 = new Triungle();
Square sq1 = new Square();

listOfShapes.add(dr1);
listOfShapes.add(dr2);
listOfShapes.add(cr1);
listOfShapes.add(tr1);
listOfShapes.add(tr2);
listOfShapes.add(sq1);



//go tpo all elements in the list and print definitions
for (Shape currentShape : listOfShapes) {
System.out.println(currentShape.getDefinition());
}
}

    }
    

