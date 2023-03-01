
/**
 * Write a description of class aaaaa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Students implements School
{
    @Override
    public void name(){
        System.out.println("Sandy Gupta");
    }
    @Override
    public void location(){
        System.out.println("Jhapa");
    }
    
    public static void main(String[] args) {
        School school = new Students();//upcasting
        school.Check();
        school.name();
        school.location();
    }
}