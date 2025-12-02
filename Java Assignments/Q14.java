
import java.util.*;

public class Q14 {

    public static void duplicates(int arr[])
    {
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr) { set.add(i);}
        
        int n=0;
        while(n<arr.length-2)
        {
          for(int i=0;i<arr.length;i++)
          {
            if(set.contains(arr[i]))
            {
                set.remove(arr[i]);
                n++;
            }
            else
            {
                System.out.println(arr[i]);
                n++;
            }
          }
        }
    }
    public static void main (String args[])
    {
      int arr[]={4,2,4,5,2,3,1};

      duplicates(arr);
      
}
}