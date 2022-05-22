import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
      String str = "abbcccdeffg";
      //1 way
       String s = "";

        for (int i=0; i<str.length(); i++){
          //  str.substring(i, i+1); //a//b
            if(!s.contains(str.substring(i, i+1))){
                s+=str.substring(i, i+1);


            }
        }
        System.out.println(str.substring(2));

        System.out.println(s);

   //2 way
        char[] c = str.toCharArray();
        String op = "";

        for(int i=0; i<c.length; i++){
            if(!op.contains(c[i] + ""))
                op = op + c[i];
        }
        System.out.println(op);


        //3 way
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char ch : chars) {
            if(charSet.add(ch) ){
                sb.append(ch);
            }

        }
        System.out.println(sb.toString()); // abcdeftz
        //4 way

        String s2[] = str.split("");

        Set<String> set = new HashSet<>(Arrays.asList(s2));

        System.out.println("set:"+set);




        //       System.out.println(s);

        //find unique chars

        for (int i=0; i<str.length(); i++){
            char c2 = str.charAt(i);
            if(str.indexOf(c2)==str.lastIndexOf(c2)){
                System.out.print(c2+", ");
            }
        }



    }
}
