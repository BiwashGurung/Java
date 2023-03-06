//Write a Java program to find the factorial value of any number entered through the keyboard using loop
import java.util.Scanner;
public class LoopForFactorialValue
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num; 
        int fact = 1; 
 
        System.out.print("Enter any positive integer: ");
        num = scan.nextInt();
 
        for(int i=1; i<=num; i++)
        {
            fact *= i;
        }
 
        System.out.println("Factorial: "+ fact);
    }
}