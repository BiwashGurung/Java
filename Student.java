
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
   public static void main(String[] args)
   {
       String name="Biwash Gurung";
       int rollNumber=5;
       boolean isPresent =true;
       float lectureHours=2.5f;
       String address="Gharipatan";
       String gender="Male";
       String module="Programming";
       
       System.out.println("My name is"+name);
       System.out.println("My roll number is"+rollNumber);
       System.out.println("My prensent is"+isPresent);
       if(isPresent){
           System.out.println("I am Present");
        }else{
            System.out.println("I am Absent");
        }
        System.out.println("The lecture hour is"+lectureHours);
        System.out.println("My address is"+address);
        System.out.println("My gender is"+gender);
        System.out.println("Subject module"+module);
        
        
        
   }
}
