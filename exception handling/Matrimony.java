import java.util.Scanner;

interface Age
{
    void checkF_age(int age) throws InvalidAgeException;
    void checkM_age(int age) throws InvalidAgeException;
}

class Marriage implements Age
{
    int age;

    public void checkF_age(int age) throws InvalidAgeException
    {
        if(age<=18 || age>=60)
        {
            throw new InvalidAgeException("Invalid female age to marriage");
        }
        else
        {
            System.out.println("Can apply for marriage");
        }
    }
    public void checkM_age(int age) throws InvalidAgeException
    {
        if(age<=21 || age>=60)
        {
            throw new InvalidAgeException("Invalid male age to marriage");
        }
        System.out.println("Can apply for marriage");
    }

}
class InvalidAgeException extends Exception
{
    InvalidAgeException()
    {
        super();
    }
    InvalidAgeException(String str)
    {
        super(str);
    }
}

class Matrimony
{
    public static void main(String args[])
    {
        int age;
        String gender,female;
    
        Scanner sc=new Scanner(System.in);
        Age a=new Marriage();
        System.out.println("enter user gender(male/female)");
        gender=sc.next();
        
       
        if(gender.equalsIgnoreCase("Female"))
        {
            System.out.println("Enter age of female");
            age=sc.nextInt();
            try
            {
                a.checkF_age(age);
            }
            catch(InvalidAgeException iae)
            {
                iae.printStackTrace();
            }

        }
        else
        {
            System.out.println("Enter age of male");
            age=sc.nextInt();
            try
            {
                a.checkM_age(age);
            }
            catch(InvalidAgeException iae)
            {
                iae.printStackTrace();
            }

        }

    }
}