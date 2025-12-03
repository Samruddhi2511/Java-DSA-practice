class Outer1
{
    void fun()
    {
        int b=20;
        System.out.println("method local inner class");
        class Inner
        {
            void gun()
            {
                System.out.println("method local inner class");
                System.out.println(b);

            }
        }
        Inner iref=new Inner();
        iref.gun();
        b++;
    
    }

    public static void main(String args[])
    {

      Outer oref=new Outer();
      oref.fun();
    
    }
}