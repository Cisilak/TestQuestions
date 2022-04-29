import java.util.Arrays;

public class GreatestElementIn2DimensionalArray {
    public static void main(String[] args) {
        //find the greatest element in 2 dimensional array
        /*
         *Logic:1. convert 2 dim array to 1 dim array then sort the elements in ascending order
         *and get the last element
         *2.
         */


            int a[][] = {{11, 21},{-5, 34},{65, 22,-7}};
            //convert 2 dim array to 1 dim array then sort the elements in ascending order
            //and get the last element

            int sum = 0;
            for(int[] w:a) {
                sum = sum+w.length;
            }
            int b[]=new int[sum];
            int idx=0;
            for(int[] w:a) {
                for(int x: w) {
                    b[idx]=x;
                    idx++;
                }
            }
        System.out.println(Arrays.toString(b));
            int min = b[0];//INTEGER.MAX_VALUE;
            for(int i=1; i<sum; i++) {
                if(min>b[i]) {
                    min=b[i];

                }

            }System.out.println(Arrays.toString(b));
            System.out.println("min: "+min);


            System.out.println(Arrays.toString(b));
            Arrays.sort(b);
            System.out.println(Arrays.toString(b));
            System.out.println("Greatest element is :" + b[sum-1]);
            System.out.println("Lowest element is :" + b[0]);
            //get the lowest value then if a value is greater than the lowest, I will
            // assign the value to the lowest


            //	int x = a[0][0];//that one works to instead of the next line
            int max2 = a[0][0]; //Integer.MIN_VALUE;//-233445666
           // int X = Integer.MAX_VALUE;

            for(int[] w:a) {

                for(int y:w) {

                    if(max2<y) {
                        max2=y;
                    }
                }
            }
            System.out.println("Max value : " + max2);
            //type the code to find the min value in a 2 dim array
            //use max.value and x>y

            //Homework: Type the code to find the minimum value in a 2 dimensional array



            int arr[][] = { {-1, -3, 0,1,2}, {65, 73, 78}, {80, 86, 90}};
            //	int x1 = arr[0][0];//that one works too
            int min2 = Integer.MAX_VALUE;//arr[0][0];
            for(int[] w : arr) {
                for(int y : w) {
                    if(min2 > y) {
                        min2 = y;
                    }
                }
            }

            System.out.println("Minimum Element is : " + min2);
        }

    }


