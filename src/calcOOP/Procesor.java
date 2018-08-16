/*
 * 
 */
package calcOOP;

/**
 * UTILISATION
 * chars [numeric, operations, etc] are to be filled in one by one
 * after each input, the state of the Ecran is printed on a line.
 * Clear All = C
 * Turn Off calc = K [kill]
 * 
 * TECHNICAL
 * 
 */
class Procesor {

    Tastatura tastatura = new Tastatura();  // build tastatura (object)

    Memory operanD1 = new Memory(); //build operanDi operaT and screen objects 
    Memory operanD2 = new Memory(); // [used as boxes with getters and setters ]
    Memory operaT = new Memory();
    Memory screen = new Memory();

    Ecran ecran = new Ecran(); //build ecran object

    BinaryOperation binaryOperation = new BinaryOperation();

    private void calculate() {

        operanD1.setMemory(null);  //empty "the boxes" [see above]
        operanD2.setMemory(null);
        operaT.setMemory(null);
        screen.setMemory(null);

        char a;   // char a is used as a vehicle for the input
        int contor = 1;      // this switch, for directing numeric input to 1st or 2nd operand
        do {
            do {
                tastatura.entry();    // read input from keyboard BY tastatura OBJECT
                a = tastatura.getInput();

// contor set 1, the "numeric" characters a are directed to operanD1, they are added one by one to the string
                if ((contor == 1) && (a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9')) {

// the following if/else is aimed at avoiding problems with the first digit, added to null
                    if (operanD1.getMemory() == null) {
                        operanD1.setMemory(Character.toString(a));
                    } else {
                        operanD1.setMemory(operanD1.getMemory() + Character.toString(a));
                    }
// operanD1 is passed to screen [which os Ecran's memory!] then this is passed to Ecran - which is asked to show/afiseaza
                    screen.setMemory(operanD1.getMemory());
                    ecran.setCesevede(screen.getMemory());
                    ecran.afiseaza();

                } else {
// when the a imput is a binary operator:
                    if (a == '+' || a == '-' || a == '*' || a == '/') {

                        if (screen.getMemory() == null) {
                            operanD1.setMemory("0"); // this is because it means operanD1 was not imputed, we assume zero                        
                            screen.setMemory("0" + Character.toString(a));

                        } else {
                            screen.setMemory(screen.getMemory() + Character.toString(a));
                        }

                        ecran.setCesevede(screen.getMemory());
                        ecran.afiseaza();
                        operaT.setMemory(Character.toString(a));
                        contor = 2;  // after the binary operation the a chars will be directed to operanD2

                    } else {
// here [after contor=2] characters are directed to operanD2
                        if ((contor == 2) && (a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9')) {
                            if (operanD2.getMemory() == null) {
                                operanD2.setMemory(Character.toString(a));
                            } else {
                                operanD2.setMemory(operanD2.getMemory() + Character.toString(a));
                            }

                            screen.setMemory(screen.getMemory() + Character.toString(a));
                            ecran.setCesevede(screen.getMemory());
                            ecran.afiseaza();
//when the character '=' is inputted 
                        } else {
                            if (a == '=') {

                                if (screen.getMemory() == null) {
                                    screen.setMemory(Character.toString(a));
                                } else {
                                    screen.setMemory(screen.getMemory() + Character.toString(a));
                                }
                                ecran.setCesevede(screen.getMemory());
                                ecran.afiseaza();
                                screen.setMemory( /*screen.getMemory() + */binaryOperation.binaryOperation(operanD1.getMemory(), operanD2.getMemory(), operaT.getMemory()));
                                ecran.setCesevede(screen.getMemory());
                                ecran.afiseaza();
                                operanD1.setMemory(screen.getMemory()); // result is stored as operanD1, so that THE CALCULATION CAN CONTINUE with an operand and operanD2
                                operanD2.setMemory(null);   // operanD2 is set to null so that a new value can be filled in

                            } else {
                                // nothing happens AT ALL if other characters than numeric and operators are filled out    
                            }
                        }
                    }

                }

            } while ((a != 'C') && (a != 'K'));
            
            operanD1.setMemory(null);  //empty "the boxes" [see above]
            operanD2.setMemory(null);
            operaT.setMemory(null);
            screen.setMemory(null);
            
            contor = 1;  // this directs characters to operanD1 again after AllClear
            
            
            
        } while (a != 'K');  // this Kills the calculator

    }

    
    
    
    
    public static void main(String[] args) {
        Procesor procesor = new Procesor();
        procesor.calculate();
    }

}
