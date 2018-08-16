/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcUML;

/**
 *
 * @author ernst
 */
public class Key {

    private Character keyLabel;
    boolean pushState = false;

    public void markKey(Character markup) {
        this.keyLabel = markup;
    }

    public void pushKeyLabel() {
        pushState = true;
    }

    public Character keyToChar() {
        return keyLabel;
    }    
    
    
    public boolean isPushState() {
        return pushState;
    }

    public void setPushState(boolean pushState) {
        this.pushState = pushState;
    }

}
