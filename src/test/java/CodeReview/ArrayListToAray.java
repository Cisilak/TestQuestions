package CodeReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToAray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("alicanali");
        list.add("veli");
        list.add("canali");
        System.out.println(list);
        String [] arr = new String [list.size()];
//
//        arr = list.toArray(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[0]);

        for (int i=0; i<list.size(); i++) {
            arr[i]= list.get(i);

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);

        int max = Integer.MIN_VALUE;
        String longest=null;
        for (String w:arr){
            if(w.length()>max){
                max=w.length();
                longest=w;
            }
        }
        System.out.println(longest);


    }
}
