//non static normal inner class
 
class Outer
{   
    int a;

  class Inner 
  {  
    int b;

    void fun()
    {
        System.out.println("Inner class fun method"+a+b);
    }


  }
}
void gun()
{
    Inner iobj=new Inner();
    iobj.fun();

}
public static void main(String args[])
{
    Outer oref=new Outer();
    Inner iref=oref.new Inner();
    iref.fun();
  
  
   Outer oref=new Outer();
    oref.gun();             

}








