
/**
 * Write a description of class MyClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyClass
{
    public static void main (String [] args){
        Calculation calculate = new Calculation();
        calculate.numberOne=1;
        calculate.numberTwo=4;
        int addition=calculate.add();
        int subtraction=calculate.subtract();
        calculate.display(addition);
        calculate.display(subtraction);
        
    
    }
    }
