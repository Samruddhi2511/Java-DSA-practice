import java.util.Scanner;
interface connect
{
    void checkUsername(String str) throws InvalidUserName;
    void checkPassword(String pass) throws InvalidPassword;
}

class Login implements connect
{
    String username="Samruddhi";
    String password="sam2511";
    public void checkUsername(String str)throws InvalidUserName
    {
        if(!str.equals(username))
        {
            throw new InvalidUserName("Username invalid");
        }
    }
    public void checkPassword(String pass)throws InvalidPassword
    {
        if(!pass.equals(password))
        {
            throw new InvalidPassword("Password not match");
        }
    }
}

class InvalidUserName extends Exception
{
    InvalidUserName()
    {
        super();
    }
    InvalidUserName(String str)
    {
        super(str);
    }
}
class InvalidPassword extends Exception
{
    InvalidPassword()
    {
        super();
    }
    InvalidPassword(String str)
    {
        super(str);
    }
}

class Application
{
    public static void main(String[] args) 
    {
        String username,password;
        Scanner sc=new Scanner(System.in);
        connect c1=new Login();        
        System.out.println("Enter username");
        username=sc.next();
        try
        {
            c1.checkUsername(username);
            System.out.println("Enter password");
            password=sc.next();
            try
            {
                c1.checkPassword(password);
                System.out.println("Login Succesful");
            }
            catch(InvalidPassword p)
            {
                p.printStackTrace();
            }

        }
        catch(InvalidUserName u)
        {
            u.printStackTrace();
        }
    }
}