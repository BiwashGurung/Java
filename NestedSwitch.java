
/**
 *Java program to demonstrate the use of Java Nested
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
public class NestedSwitch
{
    public static void main(String[] args)
    {
        int a=1,b=2;
        //outer switch
        switch(a){
            //if a==1
            case 1:
                //nested switch
                switch (b) {
                    //if b==2
                    case 2:
                        System.out.println("Choice is 2");
                        break;
                    //If y==3
                    case 3: 
                        System.out.println("Choice is 3");
                        break;
                }
                break;
            //if a == 4;
            case 4:
                System.out.println("Choice is 4");
                break;
            default:
                System.out.println("Choice is other than 1, 2, 3, or 4");
        }
    }
}
