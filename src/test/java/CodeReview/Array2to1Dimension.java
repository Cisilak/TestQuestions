package CodeReview;

import java.util.Arrays;
import java.util.Collections;

public class Array2to1Dimension {
    public static void main(String[] args) {
        int a[][] = {{15, 2}, {3, 13, 5}, {6, 7, 8, 9, 19}};
        int totalLength=0;
        for (int []w:a){
           totalLength= totalLength+w.length;
        }

        int b[] =new int[totalLength];
        System.out.println(Arrays.toString(b));
        int i=0;
        for (int [] w:a){
            for (int x:w){
               b[i] =x;
               i++;
            }
        }
        System.out.println(Arrays.toString(b));
        int max = Integer.MIN_VALUE;
        for (int j:b){
            if(max<j){
                max=j;
            }

        }
        System.out.println(max);

        Arrays.sort(b);
        System.out.println(b[b.length-1]);

        //finding max number in 2 dimensional array without converting it to 1 dimensional
        int maxx=Integer.MIN_VALUE;
        for (int []z:a){
            for (int k:z){
                if(maxx<k){
                    maxx=k;
                }
            }
        }
        System.out.println(maxx);
    }
}
