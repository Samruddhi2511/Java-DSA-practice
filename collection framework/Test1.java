//insert an element and remove an element in arrayList at first position

import java.util.ArrayList;
import java.util.HashSet;

class Test1
{
    public static void main(String args[])
    {

        ArrayList al=new ArrayList();
       al.add("aaa");
       al.add("bbb");
       al.add("ccc");
       al.add("ddd");
       
       System.out.println(al);
       
       int i=0;
       Object[] obj=al.toArray();
       System.out.println(obj[i]);

       al.add(0,"pp");
              
       System.out.println(al);


       al.remove("pp");
              
       System.out.println(al);


       




    }
}