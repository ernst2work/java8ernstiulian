/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcOOP;

/**
 *
 * @author ernst
 */
class BinaryOperation {

    public String binaryOperation(String m, String n, String p) {
        String result = null;
//        System.out.println(m);
//        System.out.println(n);
//        System.out.println(p);
        switch (p) {
            case "+":
                result = String.valueOf(Integer.parseInt(m) + Integer.parseInt(n));
break;
            case "-":
                result = String.valueOf(Integer.parseInt(m) - Integer.parseInt(n));
break;
            case "*":
                result = String.valueOf(Integer.parseInt(m) * Integer.parseInt(n));
break;
            case "/":
                result = String.valueOf(Integer.parseInt(m) / Integer.parseInt(n));
break;                
        } 
        return result;
    }
}
