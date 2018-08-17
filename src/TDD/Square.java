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
public class Square extends Plane {
    private String definition;
    
    //constructor
    public Square() {
        definition = super.getDefinition() + " with four equal straight sides and four right angles..";
    }
    
    @Override
    public String getDefinition() {
        return definition;
    }
}
