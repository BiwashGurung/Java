
/**
 * Write a description of class c here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CaculatingMean {
   public static void main(String args[]){
      double mean;
      int sum, i;
      int n = 5;
      int a[] = {2,6,7,4,9};
      sum = 0;

      for(i = 0; i < n; i++) {
         sum+=a[i];
      }
      System.out.println("Mean :"+ sum/(double)n);
   }
}