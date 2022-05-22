import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountingLetters {
    public static void main(String[] args) {
        String str = "aabbaccdf";

//        String words[] = str.split("");
//        System.out.println(Arrays.toString(words));
//
//        Map<String, Integer> result = new HashMap<>();
//        for (String w:words){
//            Integer num = result.get(w);
//            if(num==null){
//                result.put(w, 1);
//
//            }else{
//                result.put(w, num+1);
//            }
//        }
//        System.out.println(result);
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<str.length(); i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0) + 1);

        }
        System.out.println(map);
        for (Character key:map.keySet()){
            System.out.print(key+ ""+(map.get(key)!=1 ? map.get(key):""));
        }
     }
   }



