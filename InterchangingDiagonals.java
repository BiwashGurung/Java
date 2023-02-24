import java.util.Scanner;
public class InterchangingDiagonals
{
    public static void main(String[] args) 
    {
        int p, q, temp = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in matrix:");
        p = s.nextInt();
        System.out.print("Enter number of columns in matrix:");
        q = s.nextInt();
        if (p == q) 
        {
            int a[][] = new int[p][q];
            System.out.println("Enter all the elements of matrix:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    a[i][j] = s.nextInt();
                }
            }
            System.out.println("Given Matrix:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
             }
            for(int j = 0; j < q; j++)
            {
                temp = a[j][j];
                a[j][j] = a[j][q-1-j];
                a[j][q-1-j] = temp;
            }
            System.out.println("Matrix after interchanging diagonals");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }
        } 
        else 
        {
            System.out.println("Rows not equal to column");
        }
    }
}