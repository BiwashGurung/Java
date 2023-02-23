
/**
 * Write a description of class A here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// Java Program to Print the kth Element in the Array with pre defined elements
import java.util.Scanner; 
  
public class PositionOfElement 
{ 
    public static void main(String[] args) 
    { 
            // declare and intialize the array 
            int a[] = {4, 5, 6, 7 , 2, 9 , 8 , 1 , 10, 7 };
            //Print the Array elements
            System.out.println("Elements in the array ");
            for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println("");
            System.out.println("The position at which you want to check number:"); 
            
            int k = 7;
            
            //Print the element at kth  position 
            if(k<a.length)
            {
            System.out.println("Element at "+ k +"th position is " + a[k - 1]); 
            }
            else
            {
                System.out.println("Enter valid position");
            }
    } 
}