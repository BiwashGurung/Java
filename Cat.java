
/**
 * Write a description of class aaa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cat extends Pets
{
    @Override
    public void sound(){
       System.out.println("Meow Meow");
   }
   public static void main(String[] args)
   {
       Cat cat = new Cat();//creating object of cat
       cat.sound();
       cat.sleep();
   }
}
