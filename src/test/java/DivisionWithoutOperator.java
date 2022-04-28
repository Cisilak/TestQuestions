public class DivisionWithoutOperator {
    public static void main(String[] args) {

        System.out.println(division(7,3));
    }
    public static String division(int divident, int divisor) {
        int quotient = 0;
        int remainder = 0;

        while(divident >= divisor) {
            divident = divident - divisor;  //4 = 7-3 //1 = 4-3
            quotient++;                     //1       //2
            remainder = divident;           //4       //1
        }

        return "quotient = " + quotient + " remainder = " + remainder;}


}
