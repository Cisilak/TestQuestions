import java.util.Arrays;

public class ReverseStringWordByWord {

    public static void main(String[] args) {
        String sentence = "Ali Can* went to school yesterday.";
        String reverse = "";

        sentence=sentence.replaceAll("[^a-zA-Z\\s]", ""); // "\\s" == ^\\S

        System.out.println(sentence);

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        for (int i = words.length - 1; i >= 0; i--) {
            reverse = reverse + words[i] + " ";

        }
        System.out.println(reverse);
    }
}
