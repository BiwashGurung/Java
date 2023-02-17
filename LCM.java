
/**
 * Java program to find LCM between two numbers using
 * while loop and if statement.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class LCM
{
    public static void main(String[] args)
    {
        int num1=15, num2 = 10, LCM;
        //max number between num1 and num2 is stored in LCM
        LCM = (num1 > num2) ? num1 : num2;
        //Always true
        while(true){
            if(LCM % num1 == 0 && LCM % num2 == 0){
                System.out.printf("The LCM of %d and %d is %d." , num1, num2,LCM);
                break;
            }
            ++LCM;
        }
    }
}

//printf in java  stands for printing formatted output which gives you the ability to mark where in the String variables will go and pass in those variables with it.
//--------------------Process description----------------------------------------------------------------------------------------------------------------------------
//in the above program, the variable num1 and num2 stores the numbers whose LCM is to be found respectively.
//then LCM is set to be the largest number among the two variables as LCM can't be less than the largest number.
//after that we use while loop to check if the LCM is perfectly divisible by both number or not
//then loop is breaked if the LCM is found using break statement or else , we increment LCM by 1 and re-test the divisibility condition.