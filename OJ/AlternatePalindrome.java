import java.util.*;

class AlternatePalindrome{
    
    public static boolean alternatePalindrom(String str,int n){
        int cnt[] = new int[256];
        Arrays.fill(cnt, 0);
        for (int i = 0; i < n; i++)
            cnt[(str.charAt(i))]++;
        int odd = 0;
        for (int i = 0; i < 256; i++) {
            if ((cnt[i] & 1) == 1)
                odd++;
 
            if (odd > 1)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int t=sc.nextInt();
        
        for(int i=0;i<t;i++){
            
            int n=sc.nextInt();
            
            String str=sc.next();
            
            if(alternatePalindrom(str,n)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            
        }
        
    }
}