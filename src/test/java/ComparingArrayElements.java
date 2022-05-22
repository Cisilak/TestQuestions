import java.util.Arrays;

public class ComparingArrayElements {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int b[] = {2, 3, 4};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        for (int i = 0; i < a.length; i++) {

            int sum = a[i] + b[i];

                System.out.println("sum:" + sum);

            }

        }
    }





