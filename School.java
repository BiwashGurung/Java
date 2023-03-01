
/**
 * Write a description of class adf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface School 
{
    public void name();
    
    public void location();
    
    default void Check(){
        System.out.println(" Registered Done");
    }
}
