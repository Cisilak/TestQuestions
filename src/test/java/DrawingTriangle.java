import java.util.Scanner;

public class DrawingTriangle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of rows");
        int row = scan.nextInt();

        for(int i=1; i<=row; i++ ){
            for(int k=1; k<=i; k++){
                System.out.print(k+"");
            }
            System.out.println();
        }
        scan.close();

    }
}
