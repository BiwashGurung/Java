
/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RecursionExample
{
    public static void main(String[] args) {
        int total = sum(6);
        System.out.println("Total is "+total);
    }
    public static int sum(int num) {
        if (num > 0) {
            return num + sum(num - 1);
        } else {
            return 0;
        }
    }
}
