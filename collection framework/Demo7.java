import java.util.LinkedList;

class Demo7
{
    public static void main(String[] args) 
    {
      

        //addFirst()    addLast()
        LinkedList l=new LinkedList();
        l.addFirst("a");
        l.addFirst("b");
        l.addFirst("c");
        l.addFirst("d");
        l.addLast("z");
        System.out.println(l);


        l.removeFirst();
        l.removeLast();
        System.out.println(l);

        System.out.println(l.getFirst());
        System.out.println(l.getLast());





    }
   
}









//https://youtu.be/rW6kh_uyPr4?si=YNT_stZFO_qyQTAW
//https://youtube.com/shorts/L_pQrfApgkY?si=Fu1oWm6Y-SpA_q0R