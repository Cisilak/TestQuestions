package CodeReview;

public class InversePyramid {
    public static void main(String[] args) {
        int rows = 5;
        int k;
        for (int i=rows; i>0; i--){
            for (k=1; k<=rows-i; k++){
                System.out.print("  ");
            }
            for (k=0; k<2*i-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
