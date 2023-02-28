
/**
 * Write a description of class n here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class Ram extends JavaStudent
 {
     @Override
     public void name(){
         System.out.println("My name is Ram");
     }
     @Override
     public void location(){
         System.out.println("Kathmandu");
     }
     public static void main(String[] args)
     {
         Ram student = new Ram();
     }
 }
