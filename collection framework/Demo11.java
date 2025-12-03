//Set...............SortedSet.............TressSet
import java.util.SortedSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class Demo11
{
    public static void main(String[] args)
    {
       SortedSet ss= new TreeSet();    //upcasting bcoz SortedSet is interface cant crfeate object
       ss.add("a");
       ss.add("c");
       ss.add("e");
       ss.add("b");
       ss.add(new String("e"));    //for TreeSet methods should be implements to Comparable interface
       System.out.println("--------------------------------------------------------------------");
      

       System.out.println(ss);
       System.out.println("--------------------------------------------------------------------");
      
       System.out.println(ss.first());
       System.out.println("--------------------------------------------------------------------");

       System.out.println(ss.last());
       System.out.println("--------------------------------------------------------------------");
      

       System.out.println(ss.subSet("b","d"));
       System.out.println("--------------------------------------------------------------------");
      
       System.out.println(ss.headSet("b"));
       System.out.println("--------------------------------------------------------------------");
      
       System.out.println(ss.tailSet("b"));
       System.out.println("--------------------------------------------------------------------");
      
       






    }
}
