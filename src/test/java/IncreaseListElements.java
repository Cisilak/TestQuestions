import java.util.ArrayList;
import java.util.List;

//increase the value of every element by 3 except 7

public class IncreaseListElements {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(21);
        list1.add(7);
        list1.add(25);
        list1.add(9);
        list1.add(7);

        for(int i=0; i< list1.size(); i++){
            if(list1.get(i)!=7){
                list1.set(i, list1.get(i)+3);
            }else
            list1.set(i, list1.get(i)+5);
               }

        System.out.println(list1);
        }

        }


