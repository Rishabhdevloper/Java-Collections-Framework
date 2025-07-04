import java.util.*;
public class learnarraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        adq.add(34);
        adq.addFirst(67);
        adq.addLast(89);
        adq.add(56);
        System.out.println(adq);

        
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());


        System.out.println(adq.removeFirst());
        System.out.println(adq.removeLast());

        System.out.println(adq);
    }
}
