import java.util.Arrays;
public class LearnArraysClass {
    public static void main(String[] args) {
        int numbers[]={1,6,5,3,6,8};


        int indx=Arrays.binarySearch(numbers,4);
        System.out.println("The indx of the target is"+ indx);
       
       
        Arrays.sort(numbers);
        System.out.println(numbers);



        for(int i=0;i<numbers.length;i++){
            System.out.println(i);
        }

        Arrays.fill(numbers,12);

    }
}
