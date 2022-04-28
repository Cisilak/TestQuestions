public class SumOfDigits {
    public static void main(String[] args) {

        int number = 1346;
     int sum = 0;
        int digit=0;
        while(number > 0){ //1346//134//13//1
            sum = sum+ number%10; //sum+=number%10;  //6 =0+6//10=6+4//13 = 10+3//14 = 13+1
            number = number/10;  // 134//13//1//0
            digit++;
        }
        System.out.println(sum);
     System.out.println(digit);
    }



}

