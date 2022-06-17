package CodeReview;

public class DrawingPyramid {
    public static void main(String[] args) {
        int numOfRows = 5;
        int k;

        for (int i=1; i<=numOfRows; i++){
            for(k=1; k<=numOfRows-i; k++){
                System.out.print("  ");
            }
            for (k=0; k<2*i-1; k++){
                System.out.print("* ");
            }
            System.out.println();

        }


    }
}
