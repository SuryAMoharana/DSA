import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Main{
    
    public static void rotateElement(int[][] arr, int n){
        int top=0;
        int left=0;
        int right=n-1;
        int bottom=n-1;
        while(top<bottom){
            int prev=arr[top+1][left];
            for(int i=left;i<=right;i++){
                int temp=arr[top][i];
                arr[top][i]=prev;
                prev =temp;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                int temp=arr[i][right];
                arr[i][right]=prev;
                prev=temp;
            }
            right--;
            for(int i=right;i>=left;i--){
                int temp=arr[bottom][i];
                arr[bottom][i]=prev;
                prev=temp;
                
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                int temp=arr[i][left];
                arr[i][left]=prev;
                prev=temp;
            }
            left++;
        }
        for(int i=0;i<n;i++){
            String bag="";
            for(int j=0;j<n;j++){
                bag+=arr[i][j]+" ";
            }
            System.out.println(bag);
            
        }

    }
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader bf=new BufferedReader (new InputStreamReader(System.in));
        
        int n=Integer.parseInt(bf.readLine());
        
        int[][] mat=new int[n][n];
        
        for(int i=0;i<n;i++){
            
            String[] b=bf.readLine().trim().split(" ");
            
            int[] arr=Stream.of(b).mapToInt(c -> Integer.parseInt(c)).toArray();
            
            mat[i]=arr;
        }
        
        rotateElement(mat,n);
        
        //System.out.println(Arrays.deepToString(mat)+" "+n);
        
    }
}