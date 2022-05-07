import java.util.Arrays;

public class ArrayMax {
    public static void main(String[] args) {
        int arr1[] = {111, 177, 477, 844, 277};

        int max1= arr1[0];
        int max2=arr1[0];
        int max3= arr1[0];


        for(int i=1; i<arr1.length; i++) {

            if(arr1[i]> max1) {
                max3=max2; //111//111//177
                max2=max1; //111/177/477
                max1=arr1[i]; //177/477/844
            }
        }
        System.out.println("max1: "+max1);
        System.out.println("max2: "+max2);
       System.out.println("max3: "+max3);
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

    }
}


