package CodeReview;

import java.lang.reflect.Array;

public class First2MaxInArrays {
    public static void main(String[] args) {

    int max1 = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;
    int max3 = Integer.MIN_VALUE;

        int [] arr = {7, 4, 6, 5};
        for (int w:arr) {
            if(max1<w){
                max3=max2;
                max2=max1;
                max1=w;
            }else if(max2<w){
                max3=max2;
                max2=w;
            }
            else if(max3<w){
                max3=w;
            }
        }
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
  }
}
