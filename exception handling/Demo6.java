class Demo6
{
    public static void main(String args[])
    {
      int a=10,b=2;
      System.out.println("hello");
      try
      {
        
        int c=a/b;
        System.out.println(c);
        System.out.println("hello");
       
      }
      catch(ArithmeticException ae)
      {
        System.out.println(ae.getMessage());
        System.out.println();
        System.out.println(ae.toString());
        System.out.println();
        ae.printStackTrace();

     

      }
      
       
    }
}