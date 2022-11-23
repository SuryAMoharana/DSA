import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
class Main{
     public static void main(String [] arg) throws IOException{

        BufferedReader bf=new BufferedReader (new InputStreamReader(System.in));
        
        int t=Integer.parseInt(bf.readLine());
        
        for(int i=0;i<t;i++){
            
            int[] nk=   Stream.of(bf.readLine().trim().split(" ")) 
                        .mapToInt(s->Integer.parseInt(s)).toArray();
            int[] arr=   Stream.of(bf.readLine().trim().split(" ")) 
                        .mapToInt(s->Integer.parseInt(s)).toArray(); 
            rotateArray(nk[0],nk[1],arr);
        }
     }
     public static void rotateArray(int len,int k,int [] arr){
        k=k%len;
        for(int i=0;i<len;i++){
            if(i<k){
                System.out.print(arr[len+i-k]+" ");
            }
            else{
               System.out.print(arr[i-k]+" ");
            }
        }
        System.out.println();
    }
}