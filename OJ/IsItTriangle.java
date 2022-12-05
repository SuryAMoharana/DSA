import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader bf=new BufferedReader (new InputStreamReader(System.in));
        
        int t=Integer.parseInt(bf.readLine());
        
        for(int i=0;i<t;i++){
            
            String[] s=bf.readLine().trim().split(" ");
            
            int[] arr=Stream.of(s).mapToInt(c -> Integer.parseInt(c)).toArray();
            
            int a=arr[0];
            int b=arr[1];
            int c=arr[2];
            
            if(a+b>c && b+c>a && c+a>b){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}