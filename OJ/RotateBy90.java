import java.io.*; 
import java.util.*; 
import java.util.stream.*; 
import static java.util.stream.Collectors.toList; 
 
public class Main{
    public static void rotateBy90(int[][] mat, int n){
        for(int i=mat[0].length-1;i>=0;i--){
            StringBuilder bag=new StringBuilder();
            for(int j=0;j<n;j++){
                bag.append(mat[j][i]+" ");
            }
            System.out.println(bag);
        }
    }
    
    public static void main(String[] args)throws IOException{ 
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in)); 
        int n=Integer.parseInt(bf.readLine());
        int[][] mat= new int[n][n]; 
        for(int i=0;i<n;i++){ 
            int[] arr=  Stream.of(bf.readLine().trim().split(" ")) 
                        .mapToInt(s->Integer.parseInt(s)).toArray(); 
            mat[i]=arr;
        }
        rotateBy90(mat,n);
    }
}