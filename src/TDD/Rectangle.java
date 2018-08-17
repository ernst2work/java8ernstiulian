/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDD;

/**
 *
 * @author ernst
 */
public class Rectangle extends Plane {
    private String definition;
    
    //constructor
    public Rectangle() {
        definition = super.getDefinition() + " with four straight sides and four right angles,\n" +
"especially one with unequal adjacent sides, in contrast to a square.";
    }
    
    @Override
    public String getDefinition() {
        return definition;
    }
}
