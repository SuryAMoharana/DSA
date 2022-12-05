import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Main{
    
    public static void oneStationToAnother(int n, int[] arr, int s, int e){
        int t1=0;
        int t2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==s)
            {
                t1=i;
            }
            else if(arr[i]==e)
            {
                t2=i;
            }
        }
        System.out.println((t2-t1)*5*7);
    }
    
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(bf.readLine());
        for(int i=0;i<t;i++)
        {
            int n=Integer.parseInt(bf.readLine());
            
            int[] arr=  Stream.of(bf.readLine().trim().split(" "))
                        .mapToInt(c->Integer.parseInt(c)).toArray();
                        
            int[] sd=   Stream.of(bf.readLine().trim().split(" "))
                        .mapToInt(c->Integer.parseInt(c)).toArray();
            
            oneStationToAnother(n,arr,sd[0],sd[1]);
        }
    }
}