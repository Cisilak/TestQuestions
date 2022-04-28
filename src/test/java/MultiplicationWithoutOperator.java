public class MultiplicationWithoutOperator {
    public static void main(String[] args) {

        int num1 = 5, num2 = 3;   //5x3= 5+5+5
        int sum = 0;
                //1         //3
        for (int i = 1; i <= num2; i++) {
            sum = sum + num1;   //5 = 0+5
                                //10=5+5
                                //15=10+5
        }
        System.out.println(sum);
    }
}

