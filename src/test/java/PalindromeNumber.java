public class PalindromeNumber {
    public static void main(String[] args) {
        int a = 12321;

//        String s = String.valueOf(a);
//
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//
//        String reverse = String.valueOf(sb);
//
//        System.out.println(s);
//
//      //  System.out.println(sb);
//
//        System.out.println(reverse);
//
//
//        if (reverse.equals(s)){
//            System.out.println(a+" is palindrome");
//        }else{
//            System.out.println(a+" is not palindrome");
//        }

       int reversed = 0;
       while(a>0){
           int digit = a%10;
           reversed = reversed*10+digit;
           a/=10;  //a= a/10;
       }
        System.out.println(reversed);

       if(a==reversed){
           System.out.println("palindrome");
       }else{
           System.out.println("not palindrome");
       }
    }
}
