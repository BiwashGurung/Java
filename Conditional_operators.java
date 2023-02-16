
/**
 * Write a description of class C here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Conditional_operators{
    public static void main(String[] args)
    {
        int a, b;
              a = 20;
              b = (a == 1) ? 30: 40;
        System.out.println( "Value of b is : " +  b );
        
              b = (a == 20) ? 30: 40;
        System.out.println( "Value of b is : " + b );
    }
}
//conditional operater is also known as trenary operator as it works with three operands which can be used to evaluate boolean expression and return either true or false value
//expr1? expr2:expr3
//In ternary operator, if epr1 is true then expression evaluates after question mark (?) else evaluates after colon (:)