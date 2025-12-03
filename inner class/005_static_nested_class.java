class Outer
{

   static int a=10;
   static class Inner
   {
    void gun() 
    {                                                                  
        System.out.println("static nested class"+a);
    }

   }

   void fun()
   {
    System.out.println("fun outer");
   }
    public static void main(String args[])
    {
        Outer oref=new Outer();
        oref.fun();

        Inner iref=new Inner();
        iref.gun();



    }

}