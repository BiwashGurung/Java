
/**
 * Write a description of class h here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class HumanCollector
{
    public static void main(String[] args){
        Human[] arr = new Human[5];

        for(int i = 0; i<arr.length; i++){
            Scanner scan = new Scanner(System.in);
            Human human = new Human();
            System.out.println("---------------------------");
            System.out.println("-------Human Collector-------");
            System.out.println("----------------------------");
            System.out.println("please enter the name");
            human.name= scan.nextLine();
            System.out.println("please enter the age");
            human.age= scan.nextInt();
            arr[i] = human;
        }

        for(int i = 0; i<arr.length; i++){
            Human h= (Human) arr[i];
            System.out.println("--------------");
            System.out.println("Name: "+h.name);
            System.out.println("--------------");
            System.out.println("Age: "+h.age);
            System.out.println("--------------");
        }

        
    }
}
