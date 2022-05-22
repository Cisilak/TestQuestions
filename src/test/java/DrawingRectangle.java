import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class DrawingRectangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of rows");
        int row = scan.nextInt();

        System.out.println("enter number of columns");
        int col = scan.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int k = 0; k < col; k++) {
                System.out.print("* ");
            }
            System.out.println();


        }
        scan.close();
    }
}
