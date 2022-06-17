package CodeReview;

public class Pyramidd {
    public static void main(String[] args) {
        int i, j, row = 4;

        for (i = 1; i <= row; i++) {
            for (j = 1; j <= row - i; j++) { //number of spaces,as row =1, there are 4-1=3 spaces
                System.out.print("  ");//print 3 spaces and wait for the star
            }
            for (j = 1; j <= 2 * i - 1; j++) {//number of stars as row =1, 2*1-1=1 star,
                System.out.print("* ");//put 1 * in row 1 just after 3 spaces
            }
            System.out.println();
        }

        for (i = row - 1; i >= 1; i--) {
            for (j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
