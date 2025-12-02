import java.util.*;

public class Q17 
{
     public static void main(String[] args) 
    {
        int arr[]={3,-2,-8,4,1};
        int size=5;

        Arrays.sort(arr); 
           
        int mul_neg=arr[0]*arr[1]*arr[size-1];
        int mul_pos=arr[size-1]*arr[size-2]*arr[size-3];    
        System.out.println(Math.max(mul_neg,mul_pos));       
        
    }
}


