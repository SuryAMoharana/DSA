import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class MakeWaveOfArray{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader bf=new BufferedReader (new InputStreamReader(System.in));
        
        int n=Integer.parseInt(bf.readLine());
            
        String[] b=bf.readLine().trim().split(" ");
            
        int[] arr=Stream.of(b).mapToInt(c -> Integer.parseInt(c)).toArray();
        
        Arrays.sort(arr);
    
        for(int i=0; i<n; i=i+2){
            if(arr[i]<arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(Integer i:arr) System.out.print(i+" ");
        }
}