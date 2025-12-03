//super keyword in constructor
class Parent
{ 
    Parent()
    {
    System.out.println("parent ");
    }
}

class Child extends Parent
{
    Child()
    {
    super(10);            //always at 1st line of child 
    System.out.println("child");
    }
}

class Demo
{
    public static void main(String[]args)
    {
        Child ref=new Child(10);
    }

}
