package CodeReview;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
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

        l.stream().forEach(t-> System.out.print(t+" "));
        System.out.println();

        l.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
        System.out.println();

        l.stream().filter(t->t%2==0 && t>8).forEach(t-> System.out.print(t+" "));
        System.out.println();

        l.stream().distinct().filter(t->t%2==0 && t>7).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
        System.out.println();

        int sum = l.stream().distinct().filter(t->t%2==0 && t>7).map(t->t*t).reduce(0, (t,u)->t+u);
        System.out.println(sum);

        int product = l.stream().distinct().filter(t->t%2==0 && t>7).map(t->t*t).reduce(1, (t,u)->t*u);
        System.out.println(product);

        int max = l.stream().distinct().reduce(Integer.MIN_VALUE, (t,u)-> t>u?t:u);
        System.out.println(max);

        int max2 = l.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u)-> u);
        System.out.println(max2);

        int min = l.stream().distinct().reduce(Integer.MAX_VALUE, (t,u)-> t>u?u:t);
        System.out.println(min);

        int min2 = l.stream().distinct().sorted().findFirst().get();
        System.out.println(min2);


    }
}
