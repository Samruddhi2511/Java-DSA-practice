import java.util.*;

class Demo3
{
    public static void main(String args[])
    {
       
       //add method
       HashSet hs=new HashSet();
       hs.add("aaa");
       hs.add("bbb");
       hs.add("ccc");
       hs.add("ddd");


       //addAll method 
       ArrayList al=new ArrayList();
       al.addAll(hs);
      //System.out.println(al.addAll(hs));
      //System.out.println(al.addAll(hs));

       HashSet hs1=new HashSet();
       hs1.add("aaa");
       System.out.println(hs1.addAll(hs));
       System.out.println(hs1);
       System.out.println(hs1.addAll(hs)); //if all elements are present then true otherwise false
     


       ArrayList al2=new ArrayList();
       al2.add("aaa");
       al2.add("xxx");
       System.out.println(hs1.addAll(al2));
       System.out.println("------------------------------------------------------------------");

       //remove method
       System.out.println(al.remove("ccc"));
       System.out.println(al.remove("zzz"));
       System.out.println("------------------------------------------------------------------");


       //removeAll method
       ArrayList al3=new ArrayList();
       System.out.println(al.removeAll(hs));
       System.out.println(al3.removeAll(hs));  //atleast one element of al3 should be present in hs then true otherwise false
       System.out.println("------------------------------------------------------------------");


       //contains method
       ArrayList al4=new ArrayList();
       al4.add("sss");
       System.out.println(al4.contains("sss"));
       System.out.println(al4.contains("pp"));
       System.out.println("------------------------------------------------------------------");


       //containsAll method
       HashSet hs5=new HashSet();
       hs5.add("aaa");
       hs5.add("bbb");
       hs5.add("ccc");

       ArrayList al5=new ArrayList();
       al5.add("aaa");
       //al5.add("sss");
       al5.add("bbb");
       al5.add("ccc");
       


       System.out.println(al5.containsAll(hs5));
       System.out.println(al5.contains("pp"));
       System.out.println("------------------------------------------------------------------");



       //retainAll
       System.out.println(al5.retainAll(hs5));
       System.out.println("------------------------------------------------------------------");


       //toArray()
       ArrayList al6=new ArrayList();
       System.out.println("------------------------------------------------------------------");


       //object[]=['10'];
       Object[] obj=hs.toArray();

       for(int i=0;i<obj.length;i++)
       {
        System.out.println(obj[i]);
       }
       /*
       for(Object element:obj)
       {
          System.out.println(element);
       }
           */

       System.out.println(al6.toArray());
       System.out.println("------------------------------------------------------------------");



       //size() isEmpty()  clear()

       System.out.println(al.size());

       System.out.println(al5.isEmpty());

       al5.clear();
       System.out.println(al5.isEmpty());
       System.out.println("------------------------------------------------------------------");


    }
}