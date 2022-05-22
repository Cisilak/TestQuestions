package CodeReview;

public class PalindromeNum {
    public static void main(String[] args) {

        int num = 12321;
        int a = num;

        String str = String.valueOf(num);
        String reversed  =new StringBuilder(str).reverse().toString();
        int reverse= Integer.valueOf(reversed);

        if(num==reverse){
            System.out.println("palindrome");

        }else{
            System.out.println("not");
        }


        int rev=0;
        while(a>0){
            int digit = a%10;  //2//3/2//1
           rev = rev*10+digit;  //1//12//123//1232//12321
           a = a/10; //1232//123//12//1/0, break

        }
        System.out.println(rev);
        System.out.println(num);
        if(num==rev){
            System.out.println("pal");

        }else{
            System.out.println("not pal");
        }

    }
}
