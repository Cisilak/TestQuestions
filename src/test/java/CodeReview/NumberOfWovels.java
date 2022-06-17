package CodeReview;

import java.util.ArrayList;
import java.util.List;

public class NumberOfWovels {
    public static void main(String[] args) {
        String str = "abcdeeigu";

        List<Character> list=new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('u');
        list.add('o');

        int count=0;

        for (int i=0; i<str.length(); i++){
            if (list.contains(str.charAt(i))){
                count++;
            }
        }
        System.out.println(count);

    }
}
