import java.util.*;

public class Q9 {

    static int SecondLargest(int[] arr,int n){

        ArrayList<Integer> newArray=new ArrayList<>();
        for(int x: arr)
        {
            newArray.add(x);
        }
         int large= arr[0];
        for(int i=1;i<n;i++)
        {
           if(arr[i]>large)
           {
             large= arr[i];
           }
           

        }
        newArray.remove(large);
        int newlarge=newArray.get(0);
        for(int i=0;i<newArray.size();i++)
        {
            if(newArray.get(i)>newlarge)
            {
                newlarge=newArray.get(i);
            }

        }


        return newlarge;
    }

    public static void main(String[] args) {
       int arr[]={5,2,3,4,1};
       int n=arr.length;

       System.out.println(SecondLargest(arr,n));


    }
}
