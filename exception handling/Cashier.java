import java.util.Scanner;

interface Bank
{
    void withdraw(int w_amount) throws InvalidAmountException,InsufficientFundException;
    void deposit(int d_amount) throws InvalidAmountException;
    void balanceInquiry();
}

class HDFCBANK implements Bank
{
    int balance;
    HDFCBANK(int b)
    {
        this.balance=b;
    }
    public void withdraw(int w_amount)throws InvalidAmountException,InsufficientFundException
    {
        if(w_amount<=0)
        {
            throw new InvalidAmountException(w_amount+" is invalid");
        }
        if(w_amount>balance)
        {
            throw new InsufficientFundException(balance+" is less than withdraw amount");
        }
        balance=balance-w_amount;
    }
    public void deposit(int d_amount) throws InvalidAmountException
    {
        if(d_amount<=0)
        {
            throw new InvalidAmountException(d_amount+" is invalid");
        }
        balance=balance+d_amount;
    }
    public void balanceInquiry()
    {
        System.out.println("Balance is "+balance);
    }
}
class InvalidAmountException extends Exception
{
    InvalidAmountException()
    {
        super();
    }
    InvalidAmountException(String str)
    {
        super(str);
    }
}

class InsufficientFundException extends Exception
{
    InsufficientFundException()
    {
        super();
    }

    InsufficientFundException(String str)
    {
        super(str);
    }
    
}

class Cashier
{
    public static void main(String[] args) 
    {
        int choice,w_amount,d_amount;
        Scanner sc=new Scanner(System.in);
        Bank acc1=new HDFCBANK(10000);
        do
        {
            System.out.println("MENU");
            System.out.println("1.Withdraw Money");
            System.out.println("2.Deposit Money");
            System.out.println("3.Balnce Inquiry");
            System.out.println("0.Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1: System.out.println("Enter withdraw amount");
                        w_amount=sc.nextInt();
                        try
                        {  
                            acc1.withdraw(w_amount);
                        }
                        catch(InvalidAmountException i)
                        {
                            i.printStackTrace();
                        }
                        catch(InsufficientFundException ire)
                        {
                            ire.printStackTrace();
                        }
                break;
                case 2:System.out.println("Enter deposite amount");
                       d_amount=sc.nextInt();
                       try
                       {  
                           acc1.deposit(d_amount);
                       }
                       catch(InvalidAmountException i)
                       {
                           i.printStackTrace();
                       }
                break;      
                case 3:acc1.balanceInquiry();
                break;
                case 0:
                break;

            }
            
        }while(choice!=0);
    }
}


