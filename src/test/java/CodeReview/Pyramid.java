package CodeReview;

public class Pyramid {
    public static void main(String[] args) {
        int i, k, row=5;

        for(i=1; i<=row; i++){
            for(k=1; k<=row-i; k++){
                System.out.print("  ");
            }
            for(k=0; k<2*i-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
