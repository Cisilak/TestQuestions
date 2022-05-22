package CodeReview;

import java.util.*;

public class MinDifference {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(7);

        Collections.sort(list);
        int minDif = Integer.MAX_VALUE;

        for (int i = 1; i < list.size(); i++) {
            minDif = Math.min(minDif, list.get(i)-list.get(i-1));
            if(list.get(i)-list.get(i-1)==minDif)
                System.out.println(list.get(i)+"--"+list.get(i-1));
        }
        System.out.println(minDif);
       }
    }

