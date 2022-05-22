package CodeReview;

import java.util.ArrayList;
import java.util.List;

public class ChangeListElements {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for (int i=0; i<list.size(); i++){
            if (list.get(i)%2==0){
                list.set(i, list.get(i)*3);
            }else{
                list.set(i, list.get(i)*2);
            }
        }
        System.out.println(list);
    }
}
