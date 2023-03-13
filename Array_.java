//Question:- Find the largest and smallest elements of an array.
import java.util.*;
public class Array_
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        for(int i = 0; i<a.length; i++){
            System.out.println("Enter the value for a");
            a[i] = scan.nextInt();
        }
        int largest = a[0];
        int smallest = a[0];
        for(int i = 0; i<a.length; i++){
           if(a[i] > largest)
           {
               largest = a[i];
           }
           if(a[i] < smallest)
           smallest = a[i];
        }
        System.out.println("The largest element is " +largest+ "the smallest element is"+smallest);
    }
}