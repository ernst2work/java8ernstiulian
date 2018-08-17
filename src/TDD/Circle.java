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
public class Circle extends Plane {
    private String definition;
    
    //constructor
    public Circle() {
        definition = super.getDefinition() + " whose boundary (the circumference) consists of\n" +
"points equidistant from a fixed point (the centre).";
    }
    
    @Override
    public String getDefinition() {
        return definition;
    }
    
    }
