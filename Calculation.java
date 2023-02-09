
/**
 * Write a description of class Calculation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculation
{ 
public int numberOne,numberTwo;
    
    public int add(){
        int addition = numberOne+numberTwo;
        return addition;
    }
    public int subtract(){
        int sub = numberOne-numberTwo;
        return sub;
    }
    public void display(int value){
        System.out.println(value);
    }
    
}

