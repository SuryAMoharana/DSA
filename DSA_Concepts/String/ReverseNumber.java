package String;

public class ReverseNumber {

    public static int reverseNumber(int num){
        if(num<10){
            return num;
        }

        int lastDigit=num%10;
        int remainingDigitReversed=reverseNumber(num/10);


        return remainingDigitReversed*10+lastDigit;

    }

    public static int concatenate(int a, int b){
        return a*10+b;
    }
    public static void main(String[] args) {
        //BruteForce Approach
//        int a=123;
//        String str=Integer.toString(a);
//        String reversedNum=new StringBuilder(Integer.toString(a)).reverse().toString();
//        int reversed=Integer.parseInt(reversedNum);
//        System.out.println(reversed);

        //Recursive Approach

        int num=1234;
        System.out.println(reverseNumber(num));

    }
}
