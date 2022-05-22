package CodeReview;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "abbac";

        String rev = new StringBuilder(str).reverse().toString();

        if (str.equals(rev)) {
            System.out.println("palindrome");
        } else
            System.out.println("not palindrome");


        int num = 12213;
      //  String s = String.valueOf(num);

  //      String reversed = new StringBuilder(String.valueOf(num)).reverse().toString();
        int revNum = Integer.valueOf(new StringBuilder(String.valueOf(num)).reverse().toString());

        if(num==revNum)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
        }
    }

