import java.util.*;

public class Main{

   public static void main(String[] arg){	
    
    Scanner sc = new Scanner(System.in);
    
    int t = sc.nextInt();
    
    for(int i=0; i<t; i++){
        
        
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        int[][]  mat = new int[r][c];
        
        int ans = 1;
        
        int prevMax = 1;
        
        
        for(int k=0; k<r; k++){
            
            int count = 1;
            
            for(int j=0; j<c; j++){
                
                mat[k][j]=sc.nextInt();
                
                if(mat[k][j]==1){
                    count++;
                }
                
            }
            
            if(count>prevMax){
                ans = k+1;
                prevMax = count;
            }
          
           
        }
        
        System.out.println(ans);
        
 
    }
       
   }
}