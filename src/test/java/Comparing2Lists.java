import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Comparing2Lists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        Collections.sort(list1);  //sorting will quick the process

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        Collections.sort(list2);


       List<Integer> list3 = new ArrayList<>();
//        for (int i=0; i<list1.size(); i++){
//            if(!list2.contains(list1.get(i)))
//                    list3.add(list1.get(i));
//
//            }
//
//        System.out.println(list3);


//        for (Integer w : list1) {
//
//            if (!list2.contains(w)) {
//
//                list3.add(w);
//            }
//        }
//        System.out.println(list3);
//        System.out.println(list1.equals(list2));

// 12 3     //12456
        //flag = true

        for (int i=0; i<list1.size(); i++){
            boolean flag = true;
            for(int j=0; j<list2.size(); j++){
                if(list1.get(i)==list2.get(j)){
                    flag = false;
                    break;
                }
            }
            if(flag) list3.add(list1.get(i));
        }
        System.out.println(list3);

    }
}




