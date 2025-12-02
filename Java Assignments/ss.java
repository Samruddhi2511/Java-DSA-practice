public class ss {
    
    public static void main(String[] args)
    {
        String s="ABC";

       // StingBuilder sb= new StringBuilder

       int n=s.length();
       
       for(char c:s.toCharArray())
       {
           int value=c-'a';
           if(value==0||value==4|| value==8||value==14||value==20)
           {
                n--;
           }

       }

       int fact=1;
       for(int i=2;i<=n;i++)
       {
          fact=fact*i;
       }
       
        System.out.println(fact);
    }
}
