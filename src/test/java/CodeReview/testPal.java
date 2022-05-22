package CodeReview;

public class testPal {
    public static void main(String[] args) {
        int num = 12321;

     //   String str = Integer.toString(num);
        String str2 = String.valueOf(num);
        String reversed = new StringBuilder(str2).reverse().toString();
        int rev = Integer.valueOf(reversed);

//        StringBuilder reversed = new StringBuilder(str).reverse();
//        String s = reversed.toString();


        System.out.println(reversed);

        if (num==rev){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Polindrome");
        }

    }

}

