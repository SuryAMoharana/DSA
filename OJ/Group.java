import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader bf=new BufferedReader (new InputStreamReader(System.in));
        
        int t=Integer.parseInt(bf.readLine());
        
        for(int i=0;i<t;i++){
            
            String str=bf.readLine();
            
            int ans=0;
            int start=0;
            int end=str.length();
            while(start<end){
                boolean flag=false;
                while(start<end && str.charAt(start)=='1'){
                    start++;
                    flag=true;
                }
                if(flag){
                    ans++;
                }
                else{
                    start++;
                }
            }
            System.out.println(ans);
        }
        
    }
}