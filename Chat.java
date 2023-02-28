
/**
 * Write a description of interface h here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Chat
{
    public void message();

    public void send();

    default void testConnection(){
        System.out.println("Connected."); 
    }
}

