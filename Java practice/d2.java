class Demo
{
   int a;

   static int b;

   void fun()
   {
     System.out.println("demo static fun"+a+b);
   }
   static void gun()
   {
     System.out.println("demo static gun"+b);

   }
  public static void main(String args[])
  {
   //Demo.fun();  can not access by cls name bcoz for non static obj need to create for accessing non static content
    Demo.gun(\2

    Demo d=new Demo();
    d.fun();     //non static only access by object
    d.gun();    //static can access by bothn cls name or object
  }


   
}