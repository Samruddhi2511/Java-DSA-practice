//non static normal inner class
 
class Outer
{   
    int a=10;

  class Inner 
  {  
    int b=20;

    void fun()
    {
        
        System.out.println("Inner class fun method"+a);
    }


  }

void gun()
{
    
    Inner iref=new Inner();
    iref.fun();
    
   
}
public static void main(String args[])
{
    Outer oref=new Outer();
    Outer.Inner iref=oref.new Inner();
    iref.fun();
  
  
   /* Outer oref1=new Outer();
    oref1.gun();   */      

}

}






