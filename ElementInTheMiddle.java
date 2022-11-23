import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine().trim());
        int[] arr=Stream.of(bf.readLine().trim().split(" "))
        .mapToInt(s->Integer.parseInt(s)).toArray();
        int ans=arr[0];
        for(int i=1;i<n;i++){
            boolean left=true;
            boolean right=true;
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[i]){
                    left=false;
                    continue;
                }
            }
            for(int k=i+1;k<n;k++){
                if(arr[k]<arr[i]){
                    right=false;
                    continue;
                }
            }
            
            if(left==true && right==true){
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println(-1);
    }
}