package CodeReview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDublicates {
    public static void main(String[] args) {

        String str = "abbccddeeffg";
        String s1="";
        for (int i=0; i<str.length(); i++){
            if(!s1.contains((str.substring(i, i+1)))){
                s1=s1+str.substring(i, i+1);
            }
        }
        System.out.println("s1: "+s1);

        char [] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for (char c:ch){
            if(set.add(c)){
                sb = sb.append(c);
            }
        }
        System.out.println(sb);

        String [] str1= str.split("");
        Set<String> st = new HashSet<>(Arrays.asList(str1));
        System.out.println(st);

        //unique elements

        for (int i=0; i<str.length(); i++){
            char ch2 = str.charAt(i);
            if(str.indexOf(ch2)==str.lastIndexOf(ch2)){
                System.out.print(ch2);
            }
        }
    }
}
