package CodeReview;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        l.add(15);

        int result =l.stream().distinct().filter(t->t%2==0 && t>7). map(t->t*t). reduce(0, (t,u)->t+u);
        System.out.println(result);

        int result1 =l.stream().distinct().filter(t->t%2==0 && t>7). map(t->t*t). reduce(1, (t,u)->t*u);
        System.out.println(result1);

        int result2 =l.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u)->u);
        System.out.println(result2);

        int result3 =l.stream().distinct().reduce(Integer.MIN_VALUE, (t,u)->t<u?u:t);
        System.out.println(result3);

        int result4 =l.stream().distinct().reduce(Integer.MAX_VALUE, (t,u)->t<u?t:u);
        System.out.println(result4);

        int result5 =l.stream().distinct().sorted().findFirst().get();
        System.out.println(result5);



    }


}
