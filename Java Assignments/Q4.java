
import java.util.*;
public class Q4 {

    public static int Total(int n,int length)
    {
        int sum=n;
        int prev=0;
        for(int i=1;i<length;i++)
        {
             prev=sum-1;
             sum=sum+prev;
        }

        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int length=sc.nextInt();

        System.out.println(Total(n,length));

        


    }
    
}
