import com.sun.jdi.IntegerValue;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {

        //    int a = 56, b=87, c=87, d=99;

        int[] arr = {34, 56, 76, 35, 67};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("min"+arr[0]);
        System.out.println(arr[arr.length-1]);
      //  int max = arr[0];
        int max = Integer.MIN_VALUE;

        for (int w : arr) {
            if (w > max) {
                max = w;
            }}
            System.out.println(max);

//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] > max)
//                    max = arr[i];
//            }
  //          System.out.println(max);


//        if(a>b && a>c && a>d){
//            System.out.println("max is: "+a);
//
//        }else if(b>c && c>d){
//            System.out.println("max is: "+b);
//
//        }else if(c>d){
//            System.out.println("max is: "+c);
//        }else{
//            System.out.println("max is :" +d);
//        }
//    }

//    int a = 99, b=99, c=87;  //if 2 numbers are equal
//     if(a>=b && a>=c){
//        System.out.println("max is: "+a);
//
//    }else if(b>=a && b>=c){
//        System.out.println("max is: "+b);
//
//    }else{
//        System.out.println("max is: "+c);
//    }
        }
    }

