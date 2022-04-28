public class NumbersOfDigits {
    public static void main(String[] args) {
        int num1 = 1234567;
        int digit = 0;
        while (num1 > 0) {
            num1 = num1 / 10;  //13/10=1.3 =1//17/10=1.7=1
            digit++;

        }
        System.out.println(digit);
    }
}
