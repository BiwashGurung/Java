
/**
 * Write a description of class s here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scope
{
   //method level scope example----------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
       System.out.println(myMethod(2));
       System.out.println(myMethod(23));
   }
   public static int  myMethod(int arg) {
       int secondArg = 100; //local method variable
       return secondArg + arg;
   }
}
//Scope of a variable is the part of the program where the variable are only accessible inside the bracket {} they are created.