
/**
 * Write a description of class w here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class alphabetTrianglePattern
{  
    public static void main(String[] args)   
    {  
        int n = 4;  
        for(int i = 0 ; i <= n ; i++)  
        {  
        for(int j = 0 ; j <= i ; j++)  
        {  
            System.out.print(" "+(char)(65 + i));  
        }  
            System.out.println("");  
        }  
    }  
}  
//the first loop is responsible for printing the line breaks whereas the second loop is responsible for printing the alphabet.

