
/**
 * Write a description of class n here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChatSystem implements Chat
{
    @Override
    public void message() {
        System.out.println("Hi, I am learning Java.");
    }

    @Override
    public void send() {
        System.out.println("The message has been sent."); 
    }

    public static void main(String[] args) { 
        Chat chat = new ChatSystem();
        chat.testConnection ();
        chat.message();
        chat.send();
    }
}

