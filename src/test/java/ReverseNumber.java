public class ReverseNumber {
    public static void main(String[] args) {
//        System.out.println(reverse(1234));
//    }

//    public static int reverse(int number) {
//        int reverse = 0;
//        int remainder = 0;
//
//        do{
//            remainder = number%10;  //4//3//2//1
//            reverse = reverse*10 + remainder;  //4 //43//432//4321
//            number = number/10;  //123//12//1//0
//        }while(number > 0);
//        return reverse;
//    }
        int number = 1234;
        String str = Integer.toString(number);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reverse = sb.toString();
        int num = Integer.parseInt(reverse);
        //     int num = Integer.valueOf(reverse);
        System.out.println(num);
    }
}







