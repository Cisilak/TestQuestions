package CodeReview;

import java.util.Arrays;

public class MinDif {
    public static void main(String[] args) {

        int[] a = {1, 3, 4, 6, 7, 9};

        Arrays.sort(a);

        int mindif = Integer.MAX_VALUE;

        for (int i = 1; i < a.length; i++) {

            mindif = Math.min(mindif, a[i] - a[i - 1]);
        }
        System.out.println(mindif);

        for (int i = 1; i < a.length; i++) {
            if (a[i] - a[i - 1] == mindif) {
                System.out.println(a[i] + "..." + a[i - 1]);
            }
        }
    }
}
