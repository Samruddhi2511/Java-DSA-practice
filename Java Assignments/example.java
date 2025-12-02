import java.util.*; 

public class example 
{
      public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

       // checkCase(str);
       // System.out.println(checkCase(str));
        int Upper=0;
        int Lower=0;

        if(str.length()==0)
        {
            System.out.println("invalid");
        }

        for(int i=0; i<str.length();i++)
        {
            int c=str.charAt(i);

            if(Character.isUpperCase(c))
            {
                Upper++;
            }
            if(Character.isLowerCase(c))
            {
                Lower++;
            }
            
        


    }
    if(Upper>Lower)
            {
                 System.out.println(str.toUpperCase()); 
            }
            else{
                   
                    System.out.println(str.toLowerCase()); 
            
        }
    }
}
