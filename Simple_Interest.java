
/**
 * Write a description of class q here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Simple_Interest
{
    public static void main(String args[]) 
    {
        float p, r, t;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = s.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = s.nextFloat();
        System.out.print("Enter the Time period : ");
        t = s.nextFloat();
        float simpleInterest;
        simpleInterest = (r * t * p) / 100;
        System.out.print("The Simple Interest is : " + simpleInterest);
    }
}