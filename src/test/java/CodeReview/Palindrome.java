package CodeReview;

public class Palindrome {
    public static void main(String[] args) {
         String str = "abbc";

//         StringBuilder sb = new StringBuilder(str);
//         sb.reverse();
//         String reversed = sb.toString();
//        System.out.println(reversed);
//
//
//
//         if(str.equals(reversed)){
//             System.out.println("palindrome");
//         }
//         else{
//             System.out.println("not palindrome");
//         }

         String s = "";
         for(int i = str.length()-1; i>=0; i--){
            s = s+str.charAt(i);
     }
        System.out.println("last "+s);
         if(str.equals(s)){
             System.out.println("palindrome");
         }else{
             System.out.println("not");
         }
    }
}
