
/* 
class Demo11
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner();
        sc.nextInt();
        int a=-10;
        void square()
        {
            System.out.println("square of positive number");
            
        }
        try
        {
            throw new InterruptedException();
        }
        catch(InterruptedException ie)
        {
            ie.square();
        }
    }
}

*/
import java.util.Scanner;

class Demo11 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in); 
        int num = sc.nextInt(); 

        try
         {
            if (num < 0) 
            {
                throw new InterruptedException();
            }
            System.out.println("Square of " + num + " is: " + (num * num));
        }
         catch (InterruptedException e) 
        {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static int square(int num) 
    {
        return num * num;
    }
}


