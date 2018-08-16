/*
 */
package ultimatecalculator;

/**
 *
 *
 */
abstract public class Key {
protected char label;
    
    abstract String screenMeth(char input, String screen, String memory, char operator);
    abstract String memoryMeth(char input, String screen, String memory, char operator);
    abstract char operatorMeth(char input, String screen, String memory, char operator);
    
}
