import java.util.HashMap;
import java.util.Map;

public class CountingLetters2 {
    public static void main(String[] args) {
        String str= "abaacdcdcdcce";
        //using hashmap to store unique character with integer count
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0; i < str.length(); i++){
            char currentChar = str.charAt(i);
            //to check that currentChar is not in map, if not will add 1 count for firsttime
            if(map.get(currentChar) == null){
                map.put(currentChar, 1);
            }
            /*If it is repeating then simply we will increase the count of that key(character) by 1*/
            else {
                map.put(currentChar, map.get(currentChar) + 1);
            }
        }
        //Now To find the highest character repeated
        int max=0;
        char maxCharacter = 'a';//setting to a by default
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
        //    System.out.println("Key=" + entry.getKey() + ":Value" + entry.getValue());
            if(max<entry.getValue()){
                max=entry.getValue();
                maxCharacter=entry.getKey();
            }
        }
        System.out.println("Max Character=" + maxCharacter + " and "+"Max Count : " + max);

//        int max = Integer.MIN_VALUE;
//        char result ='a';
//        for (Map.Entry<Character,Integer> entry: map.entrySet()){
//            if(entry.getValue() > max){
//                result = entry.getKey();
//            }
//
////            System.out.print(entry.getKey() + "" + (entry.getValue() != 1 ? entry.getValue() : ""));
 //       }

    }
}

