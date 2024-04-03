package String;

public class RemoveVowels {
    public static void main(String[] args) {
        String str="abcdedfjbvhsdinviuduhv";

        //Traditional Approach
//        StringBuilder updated=new StringBuilder();
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
//                continue;
//            }else{
//                updated.append(str.charAt(i));
//            }
//        }
//        System.out.println(updated.toString());

        //Optimized Approach
        String updatedStr=str.replaceAll("[aeiou]","");
        System.out.println(updatedStr);
    }
}
