public class SumOfElementsInMultidimensionalArray {
    public static void main(String[] args) {
        int arr[][] = {{5, -2, 3}, {7},{11, 45}};// int is the deepest element data type

        int sum = 0;
        int mult=1;

        for(int[] w: arr) {

            for(int x:w) {

                sum = sum +x;  //0+5=5//5-2=3//3+3=9
                mult=mult*x;
                //sum+=x;
            }
        }

        System.out.println(sum);
        System.out.println(mult);
    }
    }

