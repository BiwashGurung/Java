
/**
 * Java program to print the multiplication of the number n.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TablesOfAnyNumbers
{
    public static void main(String[] args)
    {
        //n denotes number 
        int n = 12;
        //loop from 1 to 10 to print the multiplication table of the number.
        for(int i = 1; i<=10; i++){
            //printing the n*i, 
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
