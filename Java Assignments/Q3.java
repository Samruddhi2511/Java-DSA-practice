import java.util.*;

public class Q3 {

    public static double Fuel(double diesel,double distance)
    {
       double con=(diesel/distance)*100;

       return con;
    }
    public static double FuelUS(int diesel,int distance)
    {
        double gallon=(diesel*0.2642);
        double miles=(distance*0.6214);
       double con=(miles/gallon);

       return con;

    }
    public static void main (String args[])
    {
      Scanner sc=new Scanner(System.in);
       System.out.println("enter quantity of diesel in liters");
       int diesel=sc.nextInt();
       System.out.println(("enter distance in kilometers"));
       int distance=sc.nextInt();
       
       System.out.println("fule comsumption "+Fuel(diesel,distance));

        System.out.println("fule comsumption in U.S."+FuelUS(diesel,distance));


    
}
} 