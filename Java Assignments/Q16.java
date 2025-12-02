
import java.util.*;

public class Q16 {

    public static String Ans(int arr[],int a,int b)
    {

        HashSet<Integer> set=new HashSet<>();
        for(int x:arr){set.add(x);}
        for(int i=a;i<b+1;)
        {
            if(set.contains(i))
            {
                i++;
            }
            else{
                //System.out.println("no");
                return "no";
                
            }
        }
        return "yes";
        

    }
    public static void main (String args[])
    {
      int arr[]={1 ,4 ,5 ,2 ,7, 8 ,3};
      int a=2;
      int b=6;

      System.out.println(Ans(arr, a, b));

}
}