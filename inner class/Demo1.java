//static inner class 
class Outer
{
    int a;
    class Inner
    {
        int b;
        void fun()
        {
            System.out.println("Inner class method");
        }
    }
}



class Demo1
{
    public static void main(String args[])
    {

        Outer oref=new Outer();              //outer object
        Outer.Inner iref= oref.new Inner(); 
        iref.fun();   

        Outer.Inner iref1=  new Outer().new Inner();
        iref1.fun();  

       new Outer().new Inner().fun();
        
    }
}


