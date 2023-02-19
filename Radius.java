
/**
 * Write a description of class Range here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Radius
{
   //main method
   public static void main(String[] args) {
      //width (w) and height (h) of arc
      double w = 15, h = 10;
      //find radius using the formula
      double r = ((w * w) / (8 * h) + h / 2);
      System.out.println( "Radius of the circle: "+r);
   }
}
