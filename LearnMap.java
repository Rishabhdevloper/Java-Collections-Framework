import java.util.HashMap;
import java.util.Map;
public class LearnMap {
    public static void main(String[] args) {
        HashMap<String,Integer> num=new HashMap<>();


        //Hamare key hmesha unique hogi..infact value same ho skti h..
        num.put("Books", 45);
        num.put("pencil", 5);
        num.put("rubber", 8);

        if(!num.containsKey("Books")){
            num.put("Books", 85);
        }
        //Alternative way to store elements in map generally in loops
        // HashMap<Integer,Integer>map=new HashMap<>();
        //     for(int i=0;i<n;i++){
        //         map.put(list.get(i),map.getOrDefault(list.get(i),0)+1);
        //     }
            

        System.out.println(num);


        //FOR TRAVERSAL INSIDE THE MAP..
        for(Map.Entry<String,Integer> e:num.entrySet()){
            System.out.println(e);
 
            //To fet the key only in the traversal..
            System.out.println(e.getKey());

            //To get the value only in the traversal..
            System.out.println(e.getValue());

            //FOR TRAVERSAL INSIDE ONLY KEY..
            for(String key:num.keySet()){
                System.out.println(key);
            }

            ////FOR TRAVERSAL INSIDE ONLY VALUE..
            for(Integer value:num.values()){
                System.out.println(value);
            }
        }
    }
}
//To access the frequency of the elements...
//int counter=map.getOrDefault(nums[i], 0);
