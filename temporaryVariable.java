
/**
 * Write a description of class practice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class temporaryVariable
{
    //WAP to swap two numbers using temporary variable.
    public static void main(String[] args)
    {
    int a = 5;
    int b = 10;
    int c = a;
    a = b;
    b = c;
    System.out.println("a =" +a);
    System.out.println("b =" +b);
    }
}

// //WAP to swap two numbers without using temporary variable.
// public static void main(String[] args)
// {
// int a = 5;
// int b = 10;
// a = a+b;//* yo rakhera ni milxa ..yesma a = 15 hunxa
// b = a-b;// yesma / rakhni ..yesa b=5 hunxa 
// a = a-b;//"/" rakhna ni milxa ..yesa a = 15 - 5 = 10 hunxa
// System.out.println("value of a is" +a);
// System.out.println("value of b is" +b);
// }

// //Write a program to print the area of a rectangle of sides 2 and 3 units respectively.
// public static void  main(String[] args)
// {
// int l = 3;
// int b  = 2;
// int Area = l*b;
// System.out.println("Area of rectangle is :" +Area);
// }

// //Write a program to convert Fahrenheit into Celsius.
// public static void main(String[] args)
// {
// double Fahrenheit,Celsius;
// Fahrenheit = 43;
// Celsius = ((Fahrenheit- 32)*5)/9;
// System.out.println(" Temperature Celsius is :" +Celsius);
// }