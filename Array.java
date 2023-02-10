
/**
 * Write a description of class Array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Array
{
    public static void main(String [] args)
    {
        String[] students=new String[5];
        students[0]="Ram";
        students[0]="shyam"; //new value will be updated even the values are same
        System.out.println(students[0]);
    }
}
