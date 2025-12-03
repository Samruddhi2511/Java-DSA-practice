import java.util.ArrayList;
import java.util.HashSet;

class Demo4
{
    public static void main(String args[])
    {
         ArrayList al2=new ArrayList();
       al2.add("aaa");
       al2.add("bbb");
       al2.add("ccc");
       al2.add("ddd");
       al2.add("aaa");
      // al2.add(new Demo4());
      // al2.add(new Demo4());
      // al2.add(new Demo4());
       //al2.add(new Demo4());
       

       //public void add(int index,object obj)
       al2.add(2,"eee");
       System.out.println(al2);
       System.out.println("------------------------------------------------------------------");
      

        HashSet hs=new HashSet();
       hs.add("aaa");
       hs.add("bbb");
       hs.add("ccc");
       hs.add("ddd");
    

       //public void addAll(int index, Collection c)
       al2.addAll(1,hs);
       System.out.println(al2);   //toString method override keliy
       System.out.println("------------------------------------------------------------------");


       //public Object set(int index,Object obj)
       al2.set(3, hs);
       System.out.println(al2.set(3,"gg"));
       System.out.println("------------------------------------------------------------------");

       //public Object get(Object obj)
       al2.get(2);
       System.out.println(al2);
       System.out.println("------------------------------------------------------------------");

       //public Object remove(int index)
       al2.remove(3);
       System.out.println(al2);
       System.out.println("------------------------------------------------------------------");


       //public int indexOf(Object obj)
       System.out.println(al2.indexOf("aaa"));
       System.out.println("------------------------------------------------------------------");

        //public int lastIndexOf(Object obj)
       System.out.println(al2.lastIndexOf("aaa"));
       System.out.println("------------------------------------------------------------------");



    }
}