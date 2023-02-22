
/**
 * Write a description of class MethodsOverloading here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MethodsOverloading
{
    public static void main(String[] args) {
    // Calling same method with same name but different signature.
    add(70,30); // prints The sum is 100
    add("Trishala","Gauchan"); // prints The sum is 70
    }

    public static void add(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("The sum is "+sum);
    }

    public  static void add(String num1, String num2){
        String sum = num1  +  num2;
        System.out.println("The sum is " +sum);
    }
}
//method overloading means multiple methods with the same name having different datatype and  the number of parameters
