
/**
 * Write a description of class Phrase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//question number two
public class Phrase
{
    public static void main(String[] args)
    {
        String Phrase[] = {"Knowledge", "is", "power"};
        for(int i=0; i<3;i++){
            System.out.println(Phrase[i]);
        }
        for(int i=0; i<3; i++){
            System.out.print(Phrase[i]);
        }
        System.out.println();
        for(int i=0; i<3; i++){
            System.out.println(Phrase[i]);
            if(i!=2)
            {
                if(i==0){
                    System.out.print("=");
                }else{
                    System.out.print("|");
                }
            }
        }
    }
}