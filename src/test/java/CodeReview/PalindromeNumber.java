package CodeReview;

public class PalindromeNumber {
    public static void main(String[] args) {
         int num = 12213;
         int a = num;


         int rev =0;

         while(a>0){
             int digit = a%10;
             rev = rev*10+digit;
             a=a/10;

         }if(num==rev){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
