import java.util.*;

public class MasaiRewardsSystem{
    
    public static int rewardSystem(int n, char[] charArr){
        
        int count = 0; 
        
        Map<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            
            if(map.containsKey(charArr[i])){
                map.put(charArr[i],map.get(charArr[i])+1);
                count++;
            }
            else {
                 map.put(charArr[i],1);
                 count=count+2;
            }
        }
        return count;
    }
    

   public static void main(String[] arg){	
    
    Scanner sc = new Scanner(System.in);
    
    int tc = sc.nextInt();
    
    for(int i=0; i<tc; i++){
        
        int n = sc.nextInt();
        
        char[] charArr = sc.next().toCharArray();
        
        int ans = rewardSystem(n,charArr);
        
        
        System.out.println(ans);
        
    }
       
   }
}