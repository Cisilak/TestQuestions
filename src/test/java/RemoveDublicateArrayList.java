import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDublicateArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        System.out.println(list);

        System.out.println(list.toString());

        Set<String> set = new LinkedHashSet<>(list);
        System.out.println(set);

    }
}
