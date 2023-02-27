
/**
 * Write a description of class Dogs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dogs extends Animal
{
    public void bark(){
        System.out.println(" It is barking at the stranger. ");
    }
     public static void main(String[] args)
    {
        Dogs dogs = new Dogs();
        dogs.bark();
        dogs.eats();
    }
}
