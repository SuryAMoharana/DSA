package Arrays;

import java.util.Arrays;

public class CRUDOperations {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,};

        //insert at a specific index
        arr[1]=3;
        System.out.println(Arrays.toString(arr));

        //deletion of an element
        for (int i=1;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr=Arrays.copyOf(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
