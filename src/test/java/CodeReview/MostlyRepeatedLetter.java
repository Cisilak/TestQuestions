package CodeReview;

import java.util.HashMap;
import java.util.Map;

public class MostlyRepeatedLetter {
    public static void main(String[] args) {
        String str = "abbcccdde";

        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }

        int max= Integer.MIN_VALUE;
        char result = 'a';
        for (Map.Entry<Character, Integer> entry:map.entrySet()){
            if(max<entry.getValue()){
                max = entry.getValue();
                result=entry.getKey();
            }

        }
        System.out.println(result);
        System.out.println(map);

        for (char key: map.keySet()){
            System.out.print(key+""+(map.get(key)!=1?map.get(key):""));

        }
    }
}
