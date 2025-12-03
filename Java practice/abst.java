abstract class Shape
{
    abstract void area();
}
class Circle extends Shape
{
    void area()
    {
         System.out.println("Circle area");
    }
}
class Triangle extends Shape
{
    void area()
    {
        System.out.println("Triangle area");
    }
}
class Demo
{
   public static void main(String args[])

   {
       Triangle t=new Triangle();
       t.area();
   }

}