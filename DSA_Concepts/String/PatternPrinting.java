package String;

public class PatternPrinting {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int a = 5;
        int b = 10;
        System.out.println(" " + a + b);
    }
}
