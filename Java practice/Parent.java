class Parent
{
    void fun(int a)
    {
       System.out.println("parent fun");
    }
    void gun()
    {
       System.out.println("parent gun");
    }
}
class Child extends Parent
{
    void fun(int a)
    {
         System.out.println("child fun");
    }
    void run()
    {
        System.out.println("child fun");
    }
}
class Demo
{ 
   public static void main(String args[])
{
    Parent pref=new Child();                                                          //upcasting

    pref.fun(10);  //child cha fun() access hoil bcoz late binding in java
    pref.gun();
   // pref.run();
}
}