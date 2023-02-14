
/**
 * This program shows how to calculate the factorial of a number.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Factorial
{
    public static void main(String[] args){
        int number = 3;
        //Factorial of any number us calcutated by n!
        int factorial = number;
        for(int i = (number-1); i > 1; i--){
            factorial = factorial * i;
        }
        System.out.println("Factorial of a number is " +factorial);
    }
}
