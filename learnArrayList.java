import java.util.*;
public class learnArrayList {

    //String[]student name=new String[32];
    //hum iss string array mein sirf 32 elements hi rakh skte hain 33rd element rkhne ke liye size increase kena padega islie we are going to use ArrayList.
    //ArrayList apne size  ko khud increase ya decrease kr skti hain,it does not require any size.
    public static void main(String[] args) {
         ArrayList<Integer> list=new ArrayList<>();
    //if it has size n,it made it size in future n+n/2+1
    list.add(1);
    list.add(3);
    list.add(34);
    list.add(4);
    System.out.println(list);

     ArrayList<Integer> list2=new ArrayList<>();
     list2.add(3);
     list2.add(9);
     list2.add(7);
     list2.add(1);
     System.out.println(list2);

     //To add two ArrayList
     list.addAll(list2);
     System.out.println(list);

     //TO DELTETE THE ELEMENTS FROM GIVEN INDEX IN THE LIST
     list.remove(1);
     System.out.println(list);

     //TO CLEAR ALL ELEMENTS INSIDE THE ARRAYLIST
     list.clear();
     System.out.println(list);
      
     //TO UPDATE THE ELEMENTS IN GIVEN INDEX
      list.set(0, 2000);

      //TO GET THE SIZE OF ARRAYlIST
      list.size();

      //TO CHEK THE ELEMENT PRESENT IN ARRAYLIST OR NOT
      list.contains(34);

     //FOR TRAVERSING INSIDE THE ARRAYLIST..
     //TAREEEKA NO.1
     for(int i=0;i<list.size();i++){
        System.out.println("The element is" +" "+ list.get(i) );
     }
     //TAREEKA NO.2
     for(Integer element:list){
        System.out.println("for each element"+ element);
     }
     //TAREEKA NO.3
     Iterator<Integer> it = list.iterator();
     while(it.hashNext()){
     System.out.println(it.next());
     }


    }
}