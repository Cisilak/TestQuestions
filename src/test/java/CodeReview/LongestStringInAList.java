package CodeReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestStringInAList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("alicanali");
        list.add("velicanveli");
        list.add("canali");


        int max = Integer.MIN_VALUE;
        String longest=null;
 //       System.out.println(list.get(0).length());
        for (String w:list){
            if(w.length()>max){
                max=w.length();
                longest=w;
            }
        }
        System.out.println(longest);


    }
}
