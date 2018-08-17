/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDD;

/**
 * class Plane the mother of all plane figures
 * @author ernst
 */
public class Plane extends Shape {
String definition;
public Plane(){
    definition = super.getDefinition() + " plana";
}

// return definition

    /**
     *
     * @return 
     */


@Override
protected String getDefinition(){
    return definition;
}

}
