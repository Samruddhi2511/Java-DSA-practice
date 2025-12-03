class Employee
 {
    int esal;
    int eID;
    String ename;

    
    Employee(int esal, int eID, String ename) 
    {
        
        this.esal = esal;
        this.eID = eID;
        this.ename = ename;
    }
}

class Manager extends Employee 
{
    int bonus;

   // Manager() 
    //{
        //super(); 
     //   System.out.println("child default");
   // }
     
    Manager(int esal, int eID, String ename, int bonus)
     {
        super(esal, eID, ename); 
        this.bonus = bonus;
        System.out.println("child parameterised");
    }
}

class Demo
 {
    public static void main(String args[]) 
    {
        Manager sam = new Manager(1200, 23, "samruddhi", 3000);
        
        System.out.println("Employee ID: " + sam.eID);
        System.out.println("Employee Name: " + sam.ename);
        System.out.println("Employee Salary: " + sam.esal);
        System.out.println("Bonus: " + sam.bonus);
    }
}