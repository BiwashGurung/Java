
/**
 * Program to make pattern using loop.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumbersPattern
{
    public static void main(String[] args)
    {
        int a, b, c = 1;
        //inner loop
        for(a = 1; a<=7; a++){
            //outer loop
            for(b = 1; b < a+1; b++){
                System.out.print(c++ + " "); //prints the value of c    
            }
            System.out.println(); //throws the cursor at the next line
        } //----------------end of one program---------------------------------------------------
        
        
         //the question of loop for making triangle shaped pattern 
         int n = 8;// number of rows that i want to print which is denoted using "n"
        for(int i=0; i<n; i++)
        {
         int number = 1;
         System.out.printf("%" +(n-i)*2 + "S","");
         for(int j=0;j<=i; j++)
         {System.out.printf("%4d",number);
             number = number*(i-j)/(j+1);
        }
        System.out.println();
        } //--------------end of one program---------------------------------------------------
    }
}
