
/**
 * Examples of recursion in JAVA.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recursion
{
    public static void main(String[] args)
    {
        num(20);
    }
    public static void num( int i){
        if(i<0){
            return;
        }
        System.out.println(i);
        i = i-1;
        num(i);
    }
}
/**
 * this  program passes the number 20 to the program's num method which prints the number, subtracts one from the number 
and then calls itself again until the number is reached to 0.
 */