package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr={12,2,3,4,4,4,5,6,67,4,3,3,3,45,56,5};

        //using stream
        int[] arr1= IntStream.of(arr).distinct().toArray();
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //using Set
        Set<Integer> set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        System.out.println(set);
    }
}
