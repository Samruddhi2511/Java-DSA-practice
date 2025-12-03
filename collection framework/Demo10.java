//Set

import java.util.HashSet;
import java.util.LinkedHashSet;

class Demo10
{
    public static void main(String[] args)
    {
        HashSet hs=new HashSet();
       hs.add("aaa");
       hs.add("bbb");
       hs.add("ccc");
       hs.add("ddd");

       System.out.println(hs);
       
       LinkedHashSet lset=new LinkedHashSet();
       lset.add("p");
       lset.add("q");
       lset.add("r");
       lset.add("s");


       System.out.println(lset);


    }
}
