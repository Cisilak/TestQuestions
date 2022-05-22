public class ReverseNumber {
    public static void main(String[] args) {

        //1. way
        int number1 = 1234321;
        int reversed = 0;
        int remainder = 0;

        while(number1>0){
            remainder = number1%10;
            reversed = reversed*10+remainder;
            number1 =  number1/10;
        }
        System.out.println("reversed number1 :"+reversed);

        //2.way
        int number2 = 123;
        String str = Integer.toString(number2);
    //  String str = String.valueOf(number); //this can also be used to convert int to String
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reverse = sb.toString();  //to convert sb to String
        int num = Integer.parseInt(reverse); //to convert String to int
 //     int num = Integer.valueOf(reverse);  //this can also be used to convert String to int
        System.out.println("Reversed number2 is "+num);

        //check if the number is palindrome

        if(num==number2){
            System.out.println(number2+ " is palindrome");

        }else{
            System.out.println(number2+ " is not palindrome");
        }
    }
}







