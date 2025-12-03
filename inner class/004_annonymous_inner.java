class employee 
{
    void calSal()
    {
        System.out.println("Employee salary");
    }
}
class Manager extends employee
{
    void calSal()
    {
        System.out.println("Manager salary");
    }
}
class salesman extends employee
{
    void calSal()
    {
        System.out.println("Salseman salary");
    }
}

class Demo
{
    public static void main(String args[])
    { 
        employee empref=new employee{
            void calSal()
            {
                System.out.println("Annonymous class");
            }
        };
        empref.calSal();

    }
}