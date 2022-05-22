package CodeReview;

public class NumberOfDigits {
    public static void main(String[] args) {
        int num =1234567;

        //1.way
        int count=0;
        while(num>0){
            num=num/10;
           count++;

        }
        System.out.println(count);

        //2.way
//        String str = String.valueOf(num);
//        System.out.println(str.length());

        //3.way
//        int dig = (""+num).length();
    }
}
