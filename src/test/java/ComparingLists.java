import java.util.ArrayList;
import java.util.List;

public class ComparingLists {
    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);

        System.out.println(list1);
        System.out.println(list2);

//        for (int i=0; i<list1.size(); i++){
//            if(list1.get(i) ==3 && list2.get(i)==3){
//                System.out.println(true);
//
//            }
//            System.out.println(false);

        if (list1.contains(3) && list2.contains(3)) {

            System.out.println(true);

        } else {
            System.out.println(false);
        }


    }
}

