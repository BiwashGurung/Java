
/**
 * Write a description of class k here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Lower_Matrix
{
    public static void main(String args[])
    {
        int a[][] = new int[5][5];
        System.out.println("Enter the order of your Matrics ");
        System.out.println("Enter the rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the columns:");
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        if(n == m)
         {        
             System.out.println("Enter your elements:");
              for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                {      
 
                     Scanner ss = new Scanner(System.in);
                     a[i][j] = ss.nextInt();
                     System.out.print(" ");
                 }
            }
              System.out.println("You have entered:");
              for(int i=0; i<n; i++)
               {
                for(int j=0;j<n;j++)
                {      
                     System.out.print(a[i][j] + " ");
                 }
                System.out.println("");
               }
              System.out.println("The Lower Triangular Matrix is:");
              for(int i=0;i<n;i++)
               {
                for(int j=0;j<n;j++)
                 {
                  if(i>=j)
                   {
                     System.out.print(a[i][j] +" ");
                   }
                else
                {
                    System.out.print("0"+" ");
                } 
              }
            System.out.println("");
           }
        }
         else
        {
            System.out.println("you have entered improper order");
        }
    }
}
// loops and if-else conditions are used to print only the diagonals and the elements below diagonal as it is and rest of the elements as zeros.