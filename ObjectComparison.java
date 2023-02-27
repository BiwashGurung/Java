
/**
 * Write a description of class xz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ObjectComparison  
{  
    public static void main(String[] args)   
    {  
        //creating constructor of the Double class   
        Double x = new Double(654.45555);  
        //creating constructor of the Long class   
        Long y = new Long(8987544);  
        //invoking the equals() method   
        System.out.println("Objects are not equal, hence it returns " + x.equals(y));  
        System.out.println("Objects are equal, hence it returns " + x.equals(123.45555));  
    }  
}  
