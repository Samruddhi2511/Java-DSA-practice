public class tt 
{
    public static void main(String[] args) 
    {
        String s="226";
        int count=1;

        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)<=26)
            {
                count++;
            }
        }

        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)+s.charAt(i+1)<=26)
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
