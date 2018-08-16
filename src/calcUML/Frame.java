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
public class Frame {

    private char stateFrame;
    char keyInput;
    private String processorOutput;

    public void setKeyInput(char keyInput) {
        this.keyInput = keyInput;
    }

    Screen ecran; //this is the DECLARATION an instance of the Screen class
    Processor procesor; // same
    Memory operand1; // same
    Memory operand2; //same
    Memory operator; //same
    Key[] butoane; //this is AN ARRAY of elements of Key type [Key defined in class Key]


    // following, the labels to be attached to keys, as AN ARRAY :
    Character keyLabel[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '-', '*', '/', '='};

    // here is the constructor:
    public Frame() {
        ecran = new Screen(); // instantiation of an instance of the Screen class
        procesor = new Processor();
        operand1 = new Memory();
        operand2 = new Memory();
        operator = new Memory();
        butoane = new Key[15];

// labels are attached to keys 1 to 15:
        int i = 0;
        for (Character currentLabel : keyLabel) {
            Key newKey = new Key();
            newKey.markKey(currentLabel);
            butoane[i] = newKey;
            i++;
        }
    }

}
