package CodeReview;

import java.util.Scanner;

public class DrawingRectangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a row number");
        int row= scan.nextInt();
        System.out.println("enter a column number");
        int col=scan.nextInt();

        for (int i=1; i<=row; i++){
            for (int j=1; j<=col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();

    }
}
