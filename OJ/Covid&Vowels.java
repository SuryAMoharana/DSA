import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Covid&Vowels{
    
    public static void covidVowel(String str){
        int n=str.length();
        int count=0;
        for(int i=0;i<n;i++)        {
            String bag="";
            for(int j=i;j<n;j++)
            {
                bag+=str.charAt(j);
                if(bag.contains("a") && bag.contains("i") && bag.contains("o") && bag.contains("u"))
                {
                    count++;
                }
            }
            
        }
        System.out.println(count);
    }
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader bf=new BufferedReader (new InputStreamReader(System.in));
        
        String str=bf.readLine();
        
        covidVowel(str);
        
    }
}