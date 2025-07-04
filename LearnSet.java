import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class LearnSet {
   public static void main(String[] args) {
    //Set<Integer>set=new HashSet<>();
   //Set<Integer>set=new LinkedHashSet<>();
    Set<Integer> set=new TreeSet<>();
    set.add(1);
    set.add(7);
    set.add(3);
    set.add(4);
    //THIS WILL ADD  ELEMENT ONLY ONE TIME..
    set.add(3);
System.out.println(set);

//It will give the boolEAN VALUE...
  if(set.contains(7));

   if(set.isEmpty());//It is used to check the set is empty or not...
  set.remove(7);//It take only element 


  //IT WILL GIVE SIZE OF HASHSET..

  //TO CLEAR THE SET..
  set.clear();
  set.size();//It gives number of element present inside set
  System.out.println(set);

   for(Integer s:set){
    System.out.println(s);//
   }

   } 
}


//IN LINKEDHASHSET ALL CODE WILL BE SAME BUT IT MAINTAINS THE PROPERTY OF LINKED LIST WHICH IS IT GIVES THE VALUES IN ORDER in which it pushes into the set..0(n)
//In TreeHashSet,it gives all the elements in sorted order because it is implemeted by the Binary Search Tree...T.C-0(logn)