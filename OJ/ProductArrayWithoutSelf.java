import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Main{
    
    public static void productArray(int[] arr, int n){
        
        int[] left=new int[n];
        int[] right=new int[n];
        int[] pro=new int[n];
        
        left[0]=1;
        right[n-1]=1;
        
        for(int i=1;i<n;i++) left[i]=arr[i-1]*left[i-1];
        for(int i=n-2;i>=0;i--) right[i]=arr[i+1]*right[i+1];
        for(int i=0;i<n;i++){
            pro[i]=left[i]*right[i];
            System.out.print(pro[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader bf=new BufferedReader (new InputStreamReader(System.in));
        
        int t=Integer.parseInt(bf.readLine());
        
        for(int i=0;i<t;i++){
        
            int n=Integer.parseInt(bf.readLine());
            
            String[] b=bf.readLine().trim().split(" ");
            
            int[] arr=Stream.of(b).mapToInt(c -> Integer.parseInt(c)).toArray();
            
            productArray(arr,n);
        }
        
    }
}

Time Complexity O(n)
Space Complexity O(n)



import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Main{
    
    public static int[] productArray(int[] a, int n){
        
        int prod = 1;
        int flag = 0;
 
        for (int i = 0; i < n; i++) {
            if (a[i] == 0)
                flag++;
            else
                prod *= a[i];
        }
        
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
 
            if (flag > 1) {
                arr[i] = 0;
            }
 
            else if (flag == 0)
                arr[i] = (prod / a[i]);

            else if (flag == 1 && a[i] != 0) {
                arr[i] = 0;
            }
 
            else
                arr[i] = prod;
        }
        return arr;
        
    }
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader bf=new BufferedReader (new InputStreamReader(System.in));
        
        int t=Integer.parseInt(bf.readLine());
        
        for(int i=0;i<t;i++){
        
            int n=Integer.parseInt(bf.readLine());
            
            String[] b=bf.readLine().trim().split(" ");
            
            int[] arr=Stream.of(b).mapToInt(c -> Integer.parseInt(c)).toArray();
            
            int[] ans=productArray(arr,n);
            
            System.out.println(Arrays.toString(ans).replace("[", "").replace("]", " ").replace(",", ""));
        }
        
    }
}

Time Complexity O(n)
Space Complexity O(1)
