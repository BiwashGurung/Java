
/**
 * Finding area of rhombus.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RhombusArea
{
    public static void main(String[] args)
    {
        //declaring d i.e diagonal as integer
        int d1, d2;
        d1 = 2;
        d2 = 2;
        //using if-else loop
        if(d1 <= 0|| d2 <= 0){
            System.out.println("The length of the diagonals should be positive.");
        }else{
            System.out.println("The are of rhombus is :" + " " + (d1*d2)/2);
        }
    }
}