import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class AllTwiceExceptOne{
    
    public static void allTwiceExceptOne(int[] arr, int n){
        
        int res=arr[0];
        
        for(int i=1;i<n;i++){
            res=res^arr[i];
        }
        System.out.println(res);
    }
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader bf=new BufferedReader (new InputStreamReader(System.in));
        
        int t=Integer.parseInt(bf.readLine());
        
        for(int i=0;i<t;i++){
        
            int n=Integer.parseInt(bf.readLine());
            
            String[] b=bf.readLine().trim().split(" ");
            
            int[] arr=Stream.of(b).mapToInt(c -> Integer.parseInt(c)).toArray();
            
            allTwiceExceptOne(arr,n);
        }
        
    }
}