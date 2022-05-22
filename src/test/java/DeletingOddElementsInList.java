import java.util.ArrayList;
import java.util.List;

public class DeletingOddElementsInList {
    //Create a method to delete odd elements and increase the even elements by multiplying 5
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
        System.out.println(deleteOddsIncreaseEvens(list));

    }
    public static List<Integer> deleteOddsIncreaseEvens(List<Integer> list) {
        for(int i =0; i<list.size(); i++) {
            if(list.get(i)%2==0) {
                list.set(i, list.get(i)*5);


            }else{
                list.remove(i);
                i--;

            }
        }
        return list;
    }

}
