package CodeReview;

import java.util.Arrays;
import java.util.Locale;


public class Anagram {
    public static void main(String[] args) {
        String a = "Malik23* ali";
        String b ="kilaMa65& il";


        char [] c1 = a.replaceAll("[^a-zA-Z]", "").toLowerCase(Locale.ROOT).toCharArray();
        char [] c2 = b.replaceAll("[^a-zA-Z]", "").toLowerCase(Locale.ROOT).toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

   //     boolean res = Arrays.equals(c1, c2);
//        System.out.println(Arrays.toString(c1));
//        System.out.println(Arrays.toString(c2));
        if(Arrays.equals(c1, c2)){
            System.out.println("yes");

        }else{
            System.out.println("no");
        }

        String s1 = "Hello everyone";
        String s2 = "every one HELLO";

//      anagramString(s1, s2);

    }

//    public static boolean anagramString(String str1, String str2) {
//
//        //1-kucuk harflere donustur ve bosluklari kaldir
//        str1 = str1.toLowerCase().replaceAll(" ", "");
//
//        String str11[] = str1.split("");//2-stringi String array yap
//
//        Arrays.sort(str11);//3-diziyi sort yap
//
//        System.out.println("1. array: " + Arrays.toString(str11));
//
//        str2 = str2.toLowerCase().replaceAll(" ", "");//1-
//
//        String str22[] = str2.split("");//2-
//
//        Arrays.sort(str22);//3-
//
//        System.out.println("2. array: " + Arrays.toString(str22));


//
//            if (Arrays.equals(str11, str22)) {//hazir method
//                System.out.println("anagram");
//                return true;
//            }


//        System.out.println("not");
//        return false;


        public boolean isAnagram(String s, String t) {
            char [] c1 = s.toCharArray();
            char [] c2 = t.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1, c2);
        }
    }







//    }




