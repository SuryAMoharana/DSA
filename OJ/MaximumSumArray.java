import java.util.*;

class MaximumSumArray{
    public static void maxSumarr(int[] a, int n){
        
        int max = Integer.MIN_VALUE,
            maxEnd = 0, start = 0, end = 0, s = 0;
 
        for (int i = 0; i < n; i++) {
            maxEnd += a[i];
 
            if (max < maxEnd) {
                max = maxEnd;
                start = s;
                end = i;
            }
 
            if (maxEnd < 0) {
                maxEnd = 0;
                s = i + 1;
            }
        }
        System.out.println(max);
    } 
    
    
    

   public static void main(String[] arg){	
    
    Scanner sc = new Scanner(System.in);
    
    int tc = sc.nextInt();
    
    for(int i=0; i<tc; i++){
       
       
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int j=0; j<n; j++){
            arr[j]=sc.nextInt();
        }
        
        maxSumarr(arr, n);
        
    }
 }
}