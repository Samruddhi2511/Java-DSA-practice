class Parent
{
    Parent()
    {
    System.out.println("parent deafault");
    }
    
}

class Demo extends Parent
{
    Demo()
    {
        
        this(10);             //cls cha dusra constructor call kru shkto
        super(10);
        System.out.println("demo default");
    }
    Demo(int a)
    {
        System.out.println("demo paremetarized");
    }
}



void main()
{
    public static void main(String[]args)
    {
        Demo d=new Demo();
    }

}





