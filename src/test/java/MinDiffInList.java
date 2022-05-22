import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinDiffInList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(5);
        list.add(5);
        list.add(10);

        Collections.sort(list);
        System.out.println(list);

        int minDif = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {

            minDif = Math.min(minDif, list.get(i) - list.get(i - 1));  //20000000, (3-1))//2, (0-0)



        }
        System.out.println(minDif);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) - list.get(i - 1) == minDif) {
                System.out.println(list.get(i) + "...." + list.get(i - 1));
            }
        }

        int maxDif = list.get(list.size()-1)-list.get(0);
        System.out.println(maxDif);
    }
}
