import java.util.Scanner;
class DistanceBetweenPoint
{
    public static void main(String args[])

    {

        int x1,x2,y1,y2;

        double distance;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter x1 point");

        x1=sc.nextInt();

        System.out.println("enter y1 point");

        y1=sc.nextInt();

        System.out.println("enter x2point");

        x2=sc.nextInt();

        System.out.println("enter y2 point");

        y2=sc.nextInt();  

        distance=DistanceBetweenPoint.caldistance(x1,y1,x2,y2);

        System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+distance);

    }

    public static double caldistance(int x1,int y1,int x2,int y2)
    {
        return (Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
    }

}