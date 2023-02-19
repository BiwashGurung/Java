
/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Median
{
    public static void main(String arg[])
    {
      int n=7;
      float a[]=new float[n];
      a[0]=10;
      a[1]=20;
      a[2]=30;
      a[3]=40;
      a[4]=52;
      a[5]=23;
      a[6]=15;
      float m=0;
	if(n%2==1)
	{
		m=a[(n+1)/2-1];
	}
	else
	{
		m=(a[n/2-1]+a[n/2])/2;
	}
	
       System.out.println("Median :"+m);
    }
}