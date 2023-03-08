
// Java program to demonstrate working of extended
// Euclidean Algorithm

import java.util.*;
import java.lang.*;

public class Euclidean {
    // extended Euclidean Algorithm
    public static int euclidean(int a, int b)
    {
        if (a == 0)
            return b;

        return euclidean(b % a, a);
    }

    // Driver Program
    public static void main(String[] args)
    {
        int a = 112, b = 125, g;
        g = euclidean(a, b);
        System.out.println("Euclidean(" + a + ", " + b + ") = " + g);

        a = 325;
        b = 1000;
        g = euclidean(a, b);
        System.out.println("Euclidean(" + a + ", " + b + ") = " + g);

        a = 131;
        b = 142;
        g = euclidean(a, b);
        System.out.println("Euclidean(" + a + ", " + b + ") = " + g);
    }
}