
/**
 * Write a description of class s here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
 
public class Circle {
 
    public static final double PI = Math.PI;
 
    /** Overloaded Area() function to
    *calculate the area of the circle.
    *It takes one double parameter
    */
    public void Area(double r)
    {
        double A = PI * r * r;
 
        System.out.println("Area of the circle is :" + A);
    }
 
    // Overloaded Area() function to
    // calculate the area of the circle.
    // It takes one float parameter
    public void Area(float r)
    {
        double A = PI * r * r;
 
        System.out.println("Area of the circle is :" + A);
    }
}
