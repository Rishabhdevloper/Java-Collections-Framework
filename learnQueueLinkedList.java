import java.util.*;
public class learnQueueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        //To add the elements inside the Queue
        queue.add(55);
        queue.add(51);
        queue.add(52);
        queue.add(53);
     System.out.println(queue);


     //To remove the elements inside the queue
     System.out.println(queue.remove());

     //To get the elements from top
     System.out.println(queue.peek());


     
    }
}
