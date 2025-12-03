//methods of Vector
//constructor of ArrayList and Vector


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;


class Demo5
{
    public static void main(String args[])
    {

        //constructor of ArrayList
       ArrayList al2=new ArrayList(4);     //ArrayList(int capacity)
       al2.add("aaa");
       al2.add("bbb");
       al2.add("ccc");
       al2.add("ddd");
       al2.add("aaa");
       System.out.println(al2);


        HashSet hs=new HashSet();
       hs.add("aaa");
       hs.add("bbb");
       hs.add("ccc");
       hs.add("ddd");
       ArrayList al3=new ArrayList(hs);
       System.out.println(al3);


       System.out.println("---------------------------------------------------------------");


       //constructor of vector
       Vector v=new Vector();
       v.add("pp");
       v.add("qq");
       v.add("rr");
       v.add("ss");
       System.out.println(v);

       Vector v2=new Vector(1);
       System.out.println(v2);

       Vector v3=new Vector(1,4);
       System.out.println(v3);

       Vector v4=new Vector(hs);
       System.out.println(v4);
       

       v.addElement("tt");
       System.out.println(v);
       System.out.println("---------------------------------------------------------------");

       
       System.out.println(v.firstElement());
       System.out.println("---------------------------------------------------------------");

     
       System.out.println(v.lastElement());
        System.out.println("---------------------------------------------------------------");

       System.out.println(v.elementAt(2));
       System.out.println("---------------------------------------------------------------");

       v.removeElementAt(2);
       System.out.println(v);
       System.out.println("---------------------------------------------------------------");


       System.out.println(v.removeElement("pp"));
       System.out.println("---------------------------------------------------------------");
       
       v.removeAllElements();
       System.out.println(v);
       System.out.println("---------------------------------------------------------------");



    }
}