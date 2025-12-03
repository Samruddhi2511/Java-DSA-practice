import java.util.TreeSet;

class Student implements Comparable
{
    int rollno;
    String name;
    String mobno;

    Student(int rollno,String name,String mobno)                                
    {
        this.name=name;
        this.mobno=mobno;
        this.rollno=rollno;
    }

    public String toString()
    {
  return this.rollno+this.name+this.mobno;
    }

    public int compareTo (Object obj)
    {
        Student s=(Student)obj;

        int result=0;
        try{

         result= (new Integer(this.rollno)).compareTo(s.rollno);
         
        }
        catch(ClassCastException cce)
        {
             cce.printStackTrace();
        }
        return result;
    

}

class Demo12
{
    public static void main(String[] args) 
    {
        TreeSet ts=new TreeSet();
        ts.add(new Student(10," sam ","755930"));
        ts.add(new Student(11," wak ","755930"));
        ts.add(new Student(12," fun ","755930"));
        ts.add(new Student(13," gun ","755930"));

        System.out.println(ts);
    }
}

