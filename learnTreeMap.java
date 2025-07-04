import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class learnTreeMap {
    public static void main(String[] args) {
        Map<String,Integer> num=new TreeMap<>();

        //TreeMap always stores key-value pairs which are in sorted order on the basis of the key
        //Hamare key hmesha unique hogi..infact value same ho skti h..
        num.put("Books", 45);
        num.put("pencil", 5);
        num.put("rubber", 8);
        //Thus gives the first Key of the TreeMap
        int first = countMap.firstKey();

        if(!num.containsKey("Books")){
            num.put("Books", 85);
        }

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
