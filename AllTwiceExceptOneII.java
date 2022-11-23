import java.util.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class AllTwiceExceptOneII{
    public static void main(String[] args) throws IOException{
        
        BufferedReader bf=new BufferedReader (new InputStreamReader(System.in));
        
        int t=Integer.parseInt(bf.readLine());
        
        for(int i=0;i<t;i++){
        
            int n=(Integer.parseInt(bf.readLine()))*2-1;
            
            String s=bf.readLine();
            
            String[] str=s.trim().split(" ");
            
            int[] arr=Stream.of(str).mapToInt(Integer :: parseInt).toArray();
            
            int res=arr[0];
            
            for(int j=1;j<n;j++){
                res=res ^ arr[j];
            }
            
            System.out.println(res);
        }
        
    }
}
