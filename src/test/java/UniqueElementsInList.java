import java.util.ArrayList;
import java.util.List;

public class UniqueElementsInList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        System.out.println(list1);

        list1.add(2);
        list1.add(3);
        list1.add(2);
        list1.add(2);
        list1.add(5);
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();//we will have unique elements
        for (int w:list1) {
            while(!list2.contains(w)){
                list2.add(w);
            }

        }
        System.out.println(list2);
    }
}

