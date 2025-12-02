
import java.util.*;

public class Q13 {

    public static void Output(int a[],int b[])
    {
        int newArray[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
             int count=0;
            for(int j=0;j<b.length;j++)
            {
               if(a[i]>=b[j])
               {
                count++;
                 newArray[i]=count;
               }
            }
        }

        for(int x:newArray)
        {
            System.out.println(x);
        }

    }
    public static void main (String args[])
    {
      int a[]={4, 8, 7, 5, 1};
      int b[]={4, 48, 3, 0, 1, 1, 5};

      Output(a, b);
}
}