package CodeReview;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaTest2 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Can");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");

        List<Integer> list = Arrays.asList(3,4,2,6,9);
       int max =  list.stream().max(Comparator.comparing(Integer::valueOf)).get();
       System.out.println(max);

//        int max = Integer.MIN_VALUE;
//        String longest;
//        for (String w:l){
//            if(w.length()>max){
//                max=w.length();
//                longest = w;
//                System.out.println(longest);
//            }
//
//        }


        l.stream().sorted().forEach(t-> System.out.print(t+" "));
        System.out.println();
        l.stream().sorted(Comparator.comparing(String::length)).forEach(t-> System.out.print(t+" "));
        System.out.println();

        l.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(t-> System.out.print(t+" "));
        System.out.println();

        String st = l.stream().max(Comparator.comparing(String::length)).get();
        System.out.println(st);

        String st1 = l.stream().min(Comparator.comparing(String::length)).get();
        System.out.println(st1);

        String s = l.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst().get();
        System.out.println(s);

        l.stream().sorted(Comparator.comparing(LambdaTest2::lastCharacter)).forEach(t-> System.out.print(t+" "));
    }
    public static char lastCharacter(String str){
        return str.charAt(str.length()-1);
    }
}
