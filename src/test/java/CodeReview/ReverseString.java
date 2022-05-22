package CodeReview;

import java.util.Locale;

public class ReverseString {
    public static void main(String[] args) {

        String str = "abcdef";
        reversed(str);
        stringreversed("Cetin");
    }
    public static void reversed(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }


        public static void stringreversed(String str) {
            String reverse = new StringBuffer(str).reverse().toString();
            System.out.println(reverse.toUpperCase(Locale.ROOT));

        }

}
