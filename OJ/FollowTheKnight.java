import java.util.*;
class Main{
    public static void check(int[][] matrix){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]==1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
    public static void followTheKnight(int[][] matrix,int row,int col,int p){
        if(row<0 || col<0 || row>=matrix.length || col>=matrix.length){
            return;
        }
        if(p==0){
            matrix[row][col]=1;
            return;
        }
        followTheKnight(matrix,row-2,col+1,p-1);
        followTheKnight(matrix,row-2,col-1,p-1);
        followTheKnight(matrix,row+2,col+1,p-1);
        followTheKnight(matrix,row+2,col-1,p-1);
        followTheKnight(matrix,row-1,col+2,p-1);
        followTheKnight(matrix,row+1,col+2,p-1);
        followTheKnight(matrix,row-1,col-2,p-1);
        followTheKnight(matrix,row+1,col-2,p-1);
        
    }
    
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int p=sc.nextInt();
        int row=k-1;
        int col=n-1;
        
        int[][] matrix=new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                matrix[i][j]=0;
            }
        }
        followTheKnight(matrix,row,col,p);
        check(matrix);
    }
}