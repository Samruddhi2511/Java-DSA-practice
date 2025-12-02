
import java.util.*;

public class Q7 {

    public static int calculatePrice(int pizza,int puffs,int colddrinks)
    {
        return (pizza*100 + puffs*20 + colddrinks*10);
        

    }
    public static void main (String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter no of pizzas baougth :");
       int pizza=sc.nextInt();

       System.out.println("enter no of puffs baougth :");
       int puffs=sc.nextInt();
       
       System.out.println("enter no of colddrinks baougth :");
       int colddrinks=sc.nextInt();

      int p= calculatePrice(pizza,puffs,colddrinks);
      System.out.println(p);
       

}
}