import java.util.*;
import java.util.concurrent.*;
//import java.util.Queue;
class Demo1
{
    public static void main(String args[])
    {
          PriorityQueue q=new PriorityQueue();
          q.add("a");
          q.add("b");
          q.add("c");
          q.add("d");

          System.out.println(q);
          
          System.out.println("-------------------------------------------------------");
           q.offer("yy");                //add element at last
          System.out.println(q);
          
          System.out.println("-------------------------------------------------------");
          System.out.println(q.element());
          
          System.out.println("-------------------------------------------------------");
          System.out.println(q.poll());              //delete 1st element and return
          
          System.out.println("-------------------------------------------------------");
          System.out.println(q.peek());           //return 1st element


          System.out.println("-------------------------------------------------------");

         HashSet hs=new HashSet<>();
         hs.add("ss");

         PriorityQueue pq1=new PriorityQueue<>(hs);
         System.out.println(pq1);

         PriorityQueue pq2=new PriorityQueue<>(11);
         System.out.println(pq2);

         PriorityQueue pq3=new PriorityQueue<>();
         System.out.println(pq3);

         


        ArrayBlockingQueue bq=new ArrayBlockingQueue(11);       //bounded:not insert more than capacity 
         bq.offer("pp"); 
         bq.offer("pp");
         bq.offer("pp");
         bq.offer("pp");
         bq.offer("pp");
         bq.offer("pp");
         bq.offer("pp");
         bq.offer("pp");
         bq.offer("pp");
         bq.offer("pp");
         bq.offer("pp");
         bq.offer("pp");
         bq.offer("oo");

         System.out.println(bq);



         ArrayDeque adq=new ArrayDeque<>();
         adq.addFirst("s");- 
         adq.addFirst("u");
         adq.addFirst("v");
         adq.addFirst("w");
         System.out.println(adq);

         
         System.out.println(adq.removeFirstOccurrence("t"));
         System.out.println(adq.pollFirst());  
         System.out.println(adq.pollLast()); 




         
        
         




    }
}