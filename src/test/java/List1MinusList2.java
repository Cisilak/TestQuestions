import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List1MinusList2 {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3};

        Integer[] arr2 = {1,2};

        List<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));

        List<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));

        List<Integer> list3 = new ArrayList<>();

        for(Integer w : list1) {

            if(!list2.contains(w)) {

                list3.add(w);
            }
        }

        System.out.println(list3);

    }
}
