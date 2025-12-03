class Outer
{
    void fun()
    {
        class Inner
        {
            void gun()
            {
                System.out.println("method local inner class");
            }
        }
    }

 
}
class Demo
{

    public static void main(String args[])
    {
        Inner iref=new Inner();
        iref.gun();
    }
}