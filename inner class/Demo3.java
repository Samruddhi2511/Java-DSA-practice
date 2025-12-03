//annonumous inner class

class Emp
{
     void cal_sal()
    {
        System.out.println("Employee salary");
    }

    
}
class Demo3
{
 public static void main(String args[])
 {
    Emp samruddhi=new Emp()
    {
        void cal_sal()
        {
            System.out.println("Annonamous class");

        }
    };
    samruddhi.cal_sal();

 }
}
