package CodeReview;

import java.util.Arrays;

public class DifferentNumbersInTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 11, 5, 9, 4, 3, 4, 8 };
        int[] arr2 = { 1, 7, 5, 3, 4, 8 };
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
        for (int i:arr1){
            boolean flag=true;
            for (int j:arr2){
                if (i==j){
                    flag=false;
                    break;
                }
            }
            if (flag)
                System.out.print(i+" ");

        }
  }
}
