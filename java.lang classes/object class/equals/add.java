class Add
{
    int a=1,b=2,c=3;
   
}
class Student implements Cloneable
{
    int rollno=67;
    String name="Sam";
   Add A=new Add();

   public Student clone() throws CloneNotSupportedException
   {
    return (Student)super.clone();
   }
}
class Test
{
    public static void main(String args[]) throws CloneNotSupportedException
    {
        Student s1=new Student();
        Student s2=s1.clone();
        System.out.println(s1.rollno);
        System.out.println(s1.name);
        System.out.println(s1.A.a);
        System.out.println(s1.A.b);
        System.out.println(s1.A.c);
        System.out.println(s2.rollno);
        System.out.println(s2.name);
        System.out.println(s2.A.a);
        System.out.println(s2.A.b);
        System.out.println(s2.A.c);

        s1.rollno=50;
        System.out.println(s1.rollno);
        System.out.println(s1.name);
        System.out.println(s1.A.a);
        System.out.println(s1.A.b);
        System.out.println(s1.A.c);
        System.out.println(s2.rollno);
        System.out.println(s2.name);
        System.out.println(s2.A.a);
        System.out.println(s2.A.b);
        System.out.println(s2.A.c);
    }
}
