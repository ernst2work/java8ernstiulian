/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcuPlay01;

import static java.lang.Double.parseDouble;

/**
 *
 * @author ernst
 */
public class CPU_Start {

    public void calculate() {
        Binar01 binar01 = new Binar01();
        Binar02 binar02 = new Binar02();
        Binar03 binar03 = new Binar03();
        Binar04 binar04 = new Binar04();
        
        Tastatura tastatura = new Tastatura();
        Ecran ecran = new Ecran();

//        binar01.binar01();
//        binar02.binar02();
//        binar03.binar03();
//        binar04.binar04();

        String operanD1 = null;
        String operanD2 = null;
        String operaT = null;

        Character a = null;   // char a is used as a vehicle for the input
        int contor = 1;      // this switch, for directing numeric input to 1st or 2nd operand
        do {
            do {
                tastatura.entry();    // read input from keyboard BY tastatura OBJECT
                a = tastatura.getInput();
           if (a.toString() ==null){ 
                break; 
            }else {          
                System.out.print(a);
            }

// contor set 1, the "numeric" characters a are directed to operanD1, they are added one by one to the string
                if ((contor == 1) && (a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9' || a == '.')) {

// the following if/else is aimed at avoiding problems with the first digit, added to null
                    if (operanD1 == null) {
                        operanD1=Character.toString(a);
                    } else {
                        operanD1=operanD1 + Character.toString(a);
                    }
// operanD1 is passed to screen [which os Ecran's memory!] then this is passed to Ecran - which is asked to show/afiseaza
                    ecran.setCesevede(operanD1);
                    ecran.afiseaza();

                } else {
// when the a imput is a binary operator:
                    if (a == '+' || a == '-' || a == '*' || a == '/') {

                        if (ecran.getCesevede() == null) {
                            operanD1="0"; // this is because it means operanD1 was not imputed, we assume zero                        
                            ecran.setCesevede("0" + Character.toString(a));

                        } else {
                            ecran.setCesevede(operanD1 + Character.toString(a));
                        }


                        ecran.afiseaza();
                        operaT= Character.toString(a);
                        contor = 2;  // after the binary operation the a chars will be directed to operanD2

                    } else {
// here [after contor=2] characters are directed to operanD2
                        if ((contor == 2) && (a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9' || a == '.')) {
                            if (operanD2 == null) {
                                operanD2=Character.toString(a);
                            } else {
                                operanD2=operanD2 + Character.toString(a);
                            }

                            ecran.setCesevede(ecran.getCesevede()+ Character.toString(a));
                            ecran.afiseaza();
//when the character '=' is inputted 
                        } else {
                            if (a == '=') {

                                if (ecran.getCesevede() == null) {
                                    ecran.setCesevede(Character.toString(a));
                                } else {
                                    ecran.setCesevede(ecran.getCesevede()+Character.toString(a));
                                }
                                ecran.afiseaza();
   //at this point i have the two operands and one operator stored nicely; 
   // i will send them to the relevant operation, which will return the result.
   
// System.out.print(operanD1); check 1st operator
// System.out.print(operanD2); check 2nd operator
// System.out.print(operaT); check operand
                            }
                            
switch (operaT) {
        case "+" :  ecran.setCesevede(Double.toString(binar01.calculationB(parseDouble(operanD1), parseDouble(operanD2)))) ;
        ecran.afiseaza();
        break;
        case "-" :  binar02.calculationB(parseDouble(operanD1), parseDouble(operanD2));
        ecran.afiseaza();
        break;
        case "*" :  binar03.calculationB(parseDouble(operanD1), parseDouble(operanD2));
        ecran.afiseaza();
        break;        
        case "/" :  binar04.calculationB(parseDouble(operanD1), parseDouble(operanD2));
        ecran.afiseaza();
        break;
        
        default :
                                // nothing happens AT ALL if other characters than numeric and operators are filled out    
                            }
                        }
                    }

                }

            } while ((a != 'C') && (a != 'K'));

            operanD1=null;  //empty "the boxes" [see above]
            operanD2=null;
            operaT=null;
            ecran=null;

            contor = 1;  // this directs characters to operanD1 again after AllClear

        } while (a != 'K');  // this Kills the calculator

    }

        
    public static void main(String[] args) {
        CPU_Start start = new CPU_Start();
        start.calculate();

    }

}