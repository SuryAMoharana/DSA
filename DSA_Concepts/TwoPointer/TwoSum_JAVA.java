package TwoPointer;

import java.util.Arrays;

public class TwoSum_JAVA {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,9};
        int val=7;
        System.out.println(pairSum(arr,arr.length,val));
    }
    public static boolean pairSum(int[] arr, int n, int k){
        //Using Brute Force Approach
//        boolean ans=false;
//        Arrays.sort(arr); //O(n log n) time complexity
//        for(int i=0;i<n;i++){
//            for(int j=i;j<n;j++){
//                if((arr[i]+arr[j])==k){
//                    ans=true;
//                    break;
//                }
//            }
//        }
//        return ans;
        //O(n2 n log n) and o(1)

        //Using Two Pointer Approach
        boolean ans=false;
        int i=0;
        int j=n-1;
        while(i<j){
            if((arr[i]+arr[j])==k){
                ans=true;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}
