class Outer
{
    void fun()
    {
        System.out.println("method local inner class");
        class Inner
        {
            void gun()
            {
                System.out.println("method local inner class");
            }
        }
        Inner iref=new Inner();
        iref.gun();
    
    }

    public static void main(String args[])
    {

      Outer oref=new Outer();
      oref.fun();
    
    }
}