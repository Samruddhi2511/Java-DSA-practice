class Outer
{
    
    void fun()
    {
        int a=10;
      //static b=20;  static local variable cant in function
        class Inner()
        {
            void gun()
            {

                    System.out.println("1");
                    System.out.println("2");

                    System.out.println("A");
                    System.out.println("B");
                    System.out.println("C");
                    System.out.println("D");

                   
            }
        }


        System.out.println("1");
                    System.out.println("2");

                    System.out.println("A");
                    System.out.println("B");
                    System.out.println("C");
                    System.out.println("D");

                    System.out.println("3");
                    System.out.println("4");

                    System.out.println("A");
                    System.out.println("B");
                    System.out.println("C");
                    System.out.println("D");

                    System.out.println("5");
                    System.out.println("6");

                    System.out.println("A");
                    System.out.println("B");
                    System.out.println("C");
                    System.out.println("D");

                    System.out.println("7");
                    System.out.println("8");
    }
    Inner iref=new Inner();
    iref gun();

}



void main()
{

    public static void main(String args[])
    {

    }


}