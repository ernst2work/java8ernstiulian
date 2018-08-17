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
public class Triungle extends Plane {
    private String definition;
    
    //constructor
    public Triungle() {
        definition = super.getDefinition() + " with three straight sides and three angles.";
    }
    
    @Override
    public String getDefinition() {
        return definition;
    }
}
