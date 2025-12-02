
import java.util.*;

public class Q12 {

    public static int Index(int arr[],int n)
    {
        int i=0;
        for( i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                break;
                
            }
        }
        return i;
 
    }
    public static void main (String args[])
    {
      int arr[]={1, 0, 0, 0, 0};
      int n=arr.length;

      
      int count=n-Index(arr,n);
      System.out.println(count);
}
}