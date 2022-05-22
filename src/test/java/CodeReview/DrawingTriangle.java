package CodeReview;

import java.util.Scanner;

public class DrawingTriangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of rows");
        int row = scan.nextInt();

        for (int i=1; i<=row; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
