import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ConvertingArrayToArrayList {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int w:arr) {
            list.add(w);

        }
        System.out.println(list);
    }
}
