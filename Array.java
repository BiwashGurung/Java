
/**
 * Write a description of class Array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Array
{   
    public int[] arr;
    
    public double sum(){
        double sum=0;
        for(int i = 0; i<arr.length; i++){
            sum=arr[i]+sum;
        }
        return sum;
    }

    public double average(){
        
        double av = sum()/arr.length;
        return av;
    }

    public void printEachOfArray(){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
     public void display(String str,double value){   
        System.out.println(str+value);
    }
    
}

