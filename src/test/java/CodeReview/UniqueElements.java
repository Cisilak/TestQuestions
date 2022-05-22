package CodeReview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElements {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        System.out.println(list1);

        list1.add(2);
        list1.add(3);
        list1.add(2);
        list1.add(2);
        list1.add(5);

//        List<Integer> list = new ArrayList<>();
//        for (int w:list1){
//            if(!list.contains(w)){
//                list.add(w);
//            }
//        }
//        System.out.println(list);
        Set<Integer> set = new HashSet<>();
        for (int w:list1){
            set.add(w);
        }
        System.out.println(set);
    }
}
