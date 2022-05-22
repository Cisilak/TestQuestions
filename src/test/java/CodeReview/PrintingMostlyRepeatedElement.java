package CodeReview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrintingMostlyRepeatedElement {
    public static void main(String[] args) {
        String str = "abbcccde";

//        char[] c = str.toCharArray();


        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i< str.length(); i++){
//            for(int i=0; i<c.length; i++){
  //          map.put(c[i], map.getOrDefault(c[i], 0)+1 );
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }



        int max=Integer.MIN_VALUE;
        char result = 'a';

        for (Map.Entry<Character, Integer> entry:map.entrySet()){
            if (max<entry.getValue()){
               max=entry.getValue();
                result=entry.getKey();
            }
        }
        System.out.println(result);
        System.out.println(map);

        for (Character key:map.keySet()){
            System.out.print(key+""+(map.get(key)!=1 ? map.get(key):""));
        }

    }
}
