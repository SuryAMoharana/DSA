import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Main{
    
    public static void smallerNeighbour(int[] arr, int n){
        Stack<Integer> sarr=new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!sarr.empty() && sarr.peek() >= arr[i]) {
                sarr.pop();
            }
 
            if (sarr.empty()) {
                System.out.print("-1"+" ");
            }
            else{
                System.out.print(sarr.peek() + " ");
            }
            sarr.push(arr[i]);
        }
    }
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader bf=new BufferedReader (new InputStreamReader(System.in));
    
        int n=Integer.parseInt(bf.readLine());
            
        String[] b=bf.readLine().trim().split(" ");
            
        int[] arr=Stream.of(b).mapToInt(c -> Integer.parseInt(c)).toArray();
        
        smallerNeighbour(arr,n);
            
        //System.out.println(Arrays.toString(arr)+" "+n);
        
    }
}