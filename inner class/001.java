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



class Demo
{
    public static void main(String args[])
    {

        /*Outer oref=new Outer();
        Outer.Inner iref= oref.new Inner();
        iref.fun();   */

        /* Outer.Inner iref=  new Outer().new Inner();
        iref.fun();  */

        new Outer().new Inner().fun();
    }
}