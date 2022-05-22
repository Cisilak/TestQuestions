import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//if letter is in the list, put *, if not add it to list

public class AddingElementsToListByUser {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        System.out.println("enter a letter");
        String s = scan.next().toUpperCase();

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        if(list.contains(s)){
            list.set(list.indexOf(s), "*");
        }else{
            list.add(s);
        }
        System.out.println(list);
    }
}
