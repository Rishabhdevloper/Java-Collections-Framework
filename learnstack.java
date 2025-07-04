import java.util.Stack;
public class learnstack {
    public static void main(String[] args) {
        //FOR DESIGNING A STACK WORKING IN LIFO METHOD
    Stack<String> animals=new Stack<>();


//To put the elements in stack
    animals.push("lion");
    animals.push("Dog");
    animals.push("horse");
    animals.push("Cat");
    System.out.println(animals);

 //TO GET THE ELEMENTS FROM TOP
 System.out.println(animals.peek());  
 
 //TO REMOVE THE TOP ELEMENT FROM TOP
 System.out.println(animals.pop());

 while(!animals.isEmpty()) {
    System.out.println(animals.pop());
}

    }
}
