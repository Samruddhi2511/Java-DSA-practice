class Vehicle
 {
    void fun() 
    {
        System.out.println("class vehical");
    }
}

class Car extends Vehicle
 {
    void gun()
     {
        System.out.println("class car");
    }
}

class EleCar extends Car 
{
    void run()
     {
        
        System.out.println("class electric vehical");
    }
}

class Demo
 {
    public static void main(String[] args)
     {
        EleCar e = new EleCar();
        e.run();
        e.gun();
        e.fun();
    }
}
