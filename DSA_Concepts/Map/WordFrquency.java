package Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class WordFrquency {
    public static void main(String[] args) {
        String str="How are, yoy how are, you how are you how are you";

        String words=str.replaceAll(",","");
        //System.out.println(words);
        String[] strArr= words.split(" ");
        System.out.println(Arrays.toString(strArr));

        Map<String, Integer> map=new HashMap<>();

        for(int i=0;i<strArr.length;i++){
            if(map.containsKey(strArr[i])){
                map.put(strArr[i], map.get(strArr[i])+1);
            }else{
                map.put(strArr[i],1);
            }
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println("word : "+entry.getKey()+ " frequency :"+entry.getValue());
        }
    }
}
