
import java.util.*;

public class cost 
{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int int_w=sc.nextInt();
        int ext_w=sc.nextInt();
        double cost=0;

        for(int i=0;i<int_w;i++)
        {
             double temp=sc.nextDouble();
             cost+=temp*18;
             //cost=cost+sc.nextDouble()*18;
        }

        for(int i=0;i<ext_w;i++)
        {
            double temp=sc.nextDouble();
            cost+=temp*12;
        }

        System.err.println("Total estimated cost: "+cost+" INR");

        sc.close();           //ji memory allocate keliy ti close kraychi nhitr koni pn use kru shkel

    }
    
}
