
/**
 * Printing 1-100 without using the loop.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Array
{
   public static void main(String[] args)
   {
       int [] array =new int [100];
       display(array, 0, 1);
   }
   public static void display(int[] array, int index, int number){
       array[index]= number;
       System.out.println(array[index]);
       index++;
       number++;
       if(index < array.length){
             display(array, index, number);
       }
   }
}
 // public static void main(String[] args)
    // {
        // int[] array = {1, 2, 3};
        // display(array, 0);
    // }
    // public static void display(int[] array, int index){
        // System.out.println(array[index]);
        // index++;
        // if(index < array.length){
            // display(array, index);
        // }
    // }