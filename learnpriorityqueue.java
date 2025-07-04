import java.util.*;
public class learnpriorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        //By default hmesha min heap banta h
       //It will give max heap because reverse order we use...
        pq.add(55);
        pq.add(51);
        pq.add(52);
        pq.add(53);

  //THIS WILL PROVIDE SMALLEST ELEMENT FIRST BECAUSE MINHEAP HAS MADE
     System.out.println(pq.peek());
     System.out.println(pq.remove());
     System.out.println(pq);

    }
}
