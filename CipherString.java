import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

    public class CipherS{ public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int tc=Integer.parseInt(bf.readLine().trim());
        for(int i=0;i<tc;i++){
        int n=Integer.parseInt(bf.readLine().trim());
        String[] str=bf.readLine().trim().split("");
        cipher(str,n);
        }
    }
    public static void cipher(String[] str,int n){
        int count=0;
        Stack<String> stk=new Stack<>();
        stk.push(str[0]);
        for(int i=1;i<n;i++){
            if(!str[i].equals(str[i-1])){
                System.out.print(stk.peek()+(stk.size()-count));
                count+=(stk.size()-count);
            }
            stk.push(str[i]);
        }
        System.out.print(stk.peek()+(stk.size()-count));
        System.out.println();
    }
}