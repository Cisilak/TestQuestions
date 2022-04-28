import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class NumberOfVowels {
    public static void main(String[] args) {
        System.out.println(numbers("Cb*Bhuc$a9"));
    }
    public static String numbers(String word) {
        int countVowels = 0;
        int countConsonants = 0;
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        System.out.println(vowels);
//        List<Character> consonants = new ArrayList<>();
//        System.out.println(consonants);


//        for(char i = 'a'; i <= 'z'; i++) {
//            if(!vowels.contains(i)) {
//                consonants.add(i); }  //sets consonants lit
//        }
//        System.out.println(consonants);

        word = word.toLowerCase().replaceAll("[^a-z]", "");
        System.out.println(word);
        for( int i = 0; i < word.length(); i++) {
            if(vowels.contains(word.charAt(i))) {
                countVowels++;
            }else {
                countConsonants++; }
        }
        return "number of vowels is " + countVowels + " and number of consonants is " +
                countConsonants; }
}
