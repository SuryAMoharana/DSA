import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class DecipherString{ public static void main(String[] args)throws IOException{
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int tc=Integer.parseInt(bf.readLine().trim());
        for(int i=0;i<tc;i++){
        int n=Integer.parseInt(bf.readLine().trim());
        String[] st=bf.readLine().trim().split("");
        deCipher(st,n);
        }
    }
    public static void deCipher(String[] str,int n){
       int i=1;
       while(i<n){
           for(int j=0;j<Integer.parseInt(str[i]);j++){
               System.out.print(str[i-1]);
           }
           i+=2;
       }
        System.out.println();
    }
}