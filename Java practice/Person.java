class Person
 {
    String name;
    int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void display()
    {
        System.out.println(name);
        System.out.println( age);
    }
}

class Employee extends Person 
{
    int employeeId;

    Employee(String name, int age, int employeeId) 
    {
        super(name, age);
        this.employeeId = employeeId;
    }

    
    void display1()
    {
       
        System.out.println(employeeId);
    }
}

class Demo 
{
    public static void main(String[] args)
    {
        Employee emp = new Employee("Samruddhi", 18, 2511);
        emp.display();
    }
}