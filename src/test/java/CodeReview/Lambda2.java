package CodeReview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda2 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");

        l.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(t-> System.out.print(t+" "));
        System.out.println();

        l.stream().sorted(Comparator.comparing(Lambda2::getLastChar)).forEach(t->System.out.print(t+" "));
    }
    public static char getLastChar(String str) {
        return str.charAt(str.length()-1);
    }
}
