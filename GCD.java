
/**
 * Q1.Java program to find HCF or GCD of two numbers using for loop and if statement
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GCD
{
    public static void main(String[] args) {

    // find GCD between n1 and n2
    int num1 = 81, num2 = 153;
    
    // initially set to gcd
    int gcd = 1;

    for (int i = 1; i <= num1 && i <= num2; ++i) {

      // check if i perfectly divides both n1 and n2
      if (num1 % i == 0 && num2 % i == 0)
        gcd = i;
    }

    System.out.println("GCD of " + num1 +" and " + num2 + " is " + gcd);
    //-----another question---------------------------------------------
    //Q.2 Find GCD of two numbers using while loop and if else statement
    // find GCD between n1 and n2
    int n1 = 20, n2 = 10;
    while(n1 != n2) {
    
      if(n1 > n2) {
        n1 -= n2;
      }
      
      else {
        n2 -= n1;
      }
    }

    System.out.println("GCD: " + n1);
  }
}

