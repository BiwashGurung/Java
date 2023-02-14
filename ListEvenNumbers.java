
/**
 * Write a description of class evenNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class ListEvenNumbers 
 {
     public static void main(String[] args) 
     {
         //define limit
         int limit = 10;
        
         System.out.println("Printing Even numbers between 1 and " +limit);
        
             for(int i=1; i <= limit; i++){
            
                 // if the number is divisible by 2 then it is even
                 if( i % 2 == 0){
                 System.out.print(i + " ");
                 }
             }
     }
 }