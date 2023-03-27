import java.util.Scanner; 
public class Scan
{
    public static void main(String[] args){
        Animal object = new Animal();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the name of the Animal");
        object.name = scan.nextLine();
        
    }
   
}
