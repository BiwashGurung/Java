
/**
 * Write a description of class Tutorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tutorial
{
    public static void main(String[] args)
    {
        A a = new B();//upcasting
        a.show1();
        B b =(B) a; //downcasting
        b.show2();
    }
}
