import java.util.*;

class Q2
{

    public static int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else{
            return n*fact(n-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int originalNum=num;

        int sum=0;
        while(num!=0)
        {
            int digit=num%10;
            sum=sum+fact(digit);
            num=num/10;
        
        }

        if(sum==originalNum)
        {
            System.out.println("same");
        }
        else 
          System.out.println("no");
    }
}