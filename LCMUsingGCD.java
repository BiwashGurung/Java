
/**
 * Java Program to find LCM using GCD of two numbers.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LCMUsingGCD
{
  public static void main(String[] args) {

    int n1 = 15, n2 = 10, gcd = 1;

    for(int i = 1; i <= n1 && i <= n2; ++i) {
      // Checks if i is factor of both integers
      if(n1 % i == 0 && n2 % i == 0)
        gcd = i;
    }

    int lcm = (n1 * n2) / gcd;
    System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
  }
}
