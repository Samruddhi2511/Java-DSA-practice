import java.util.*;

public class Q10 
{

    public static void main(String[] args) {
       
        int arr1[]={1,3,5,1,2};
        int arr2[]={0,1,1,0,1};
        int itr=2;
        
        for(int i=0;i<arr1.length;i++)
        {
            if(arr2[i]==1)
            {
                for(int j=1;j<=itr;j++)
                {
                     arr1[i]=arr1[i]+arr1[i];
                }
            }
        }

        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]+" ");
        }

    }
    
}






