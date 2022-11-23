import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class CodingStreak {
  public  static  void  codingStreak(int n, String [][] arr){
        int daymax = 0;
        int totalmax = 0;
        int t = 0;
        for(int i =0;i<n;i++){
            int d = 0;
            for(int j =0; j<=arr[i].length-1;j++){
                if(Objects.equals(arr[i][j], "C")){
                    d++;
                    t++;
                    if(t>totalmax){
                        totalmax = t;
                    }
                    if(d>daymax){

                    daymax = d;
                }
                }else {
                    t=0;
                    d=0;
                }
            }
        }
        System.out.println(daymax+" "+totalmax);
    }
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String []str = bf.readLine().trim().split(" ");
        int n = Integer.parseInt(str[0]);
        String  [][] arr = new String[n][n];

        for (int i=0; i<n;i++){
            str = bf.readLine().trim().split("");
            arr[i] = str;
        }
        codingStreak(n,arr);
    }
}