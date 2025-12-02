import java.util.*;

public class Q1 {

    public static int Index(int arr[],int num)
    {
        int in=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
              in=i;
              break;
            }
        }
        return in;

    }
    public static void main (String args[])
    {
      int arr[]={5,4,6,1,3,2,7,8,9};
      int num=7;

      System.out.println(Index(arr,num));
    
}
}