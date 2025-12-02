import java.util.*;

class Q6{

    public static int magic(int x, int n)
    {
        double result=0;
        int power=0;
        while(x!=0)
        {
            int d=x%10;
           // char p= (char)((d+n)%10);
             int p=(d+n)%10;
            result=result+(p*Math.pow(10,power));        //char to num
            power++;
            x=x/10;
               System.out.println(p);     
        }
         return (int)result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();

        System.out.println(magic(x, n));


       
}
}