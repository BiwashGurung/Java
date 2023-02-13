
/**
 * Write a description of class LargestNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LargestNumber
{
    public static void main(String[] args)
    {
        int[] a = {20, 200, 549, 604, 100, 50,670};
        int max = a[0];
        for(int i = 1; i<a.length; i++)
        {
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("The largest number is: " +max);
    }
}
