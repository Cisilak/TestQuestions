package CodeReview;

import java.util.Arrays;

public class SumOfArrayElements {
    public static void main(String[] args) {

        int a[] = {-2, 10, 1, 3, 5, 2, 4, 6};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == 8) {
                    System.out.println(a[i] + "<-->" + a[j]);

                }
            }
        }

        //sorting arrays

        int temp ;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
            }

        System.out.println(Arrays.toString(a));

        int max1 = Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int w:a){
            if(w>max1){
                max3=max2;
                max2=max1;
                max1=w;

            }else{
                if(w>max2){
                    max3=max2;
                    max2=w;
                }else{
                    if(w>max3){
                        max3=w;
                    }
                }
            }
        }
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
        }
    }
