import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Main{ 
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        
        int n=Integer.parseInt(bf.readLine().trim());
        int[] arr=Stream.of(bf.readLine().trim().split(" "))
                .mapToInt(s->Integer.parseInt(s)).toArray();
        checkSorted(n,arr);
    }
    public static void  checkSorted (int n,int[] arr){
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=low+((high-low)/2);
            if(arr[mid]>arr[high])
            {
                low=mid+1;
            }
            else if(arr[mid]<arr[high])
            {
                high=mid;
            }
            else
            {
                high--;
            }
        }
        if(low>0)
        {
            if(check(arr,1,low-1) && check(arr,low+1,n-1))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        else
        {
            System.out.println("NO");
        }
    }
    public static boolean  check(int[] arr,int l,int h){
        for(int i=l;i<=h;i++)
        {
            if(arr[i]<arr[i-1])
            {
                return false;
            }
        }
        return true;
    }
}