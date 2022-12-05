import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class EquilibriumElement{
    
    public static int equlibriumElement(int[] arr, int n){
        
        int sum=0;
        int lsum=0;
            
            for(int i=0;i<n;i++)
            sum+=arr[i];
            
            for(int i=0;i<n;i++){
                sum-=arr[i]; //sum now right sum of array
                
                if(lsum==sum) return i+1;
                
                lsum+=arr[i];
            }
            
            return -1;
        
    }
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader bf=new BufferedReader (new InputStreamReader(System.in));
        
        int n=Integer.parseInt(bf.readLine());
            
        String[] b=bf.readLine().trim().split(" ");
            
        int[] arr=Stream.of(b).mapToInt(c -> Integer.parseInt(c)).toArray();
        
        System.out.println(equlibriumElement(arr,n));
        
    }
}