// Java program to find perimeter of cylinder
import java.io.*;
public class PerimeterOfCylinder {
    // Function to calculate perimeter
    public static int perimeter(int diameter, int height)
    {
        return 2 * (diameter + height);
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int diameter = 50;
        int height = 20;
        System.out.println("Perimeter = " + perimeter(diameter, height)+ " units\n");
    }
}