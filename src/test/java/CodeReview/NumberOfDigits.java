package CodeReview;

public class NumberOfDigits {
    public static void main(String[] args) {
        int num =129;

        //1.way
        int count=0;
        while(num>0){
           num=num/10; //12.9//12//1//0.1=0
           count++;//1//2//3

        }
        System.out.println(count);

        //2.way
//        String str = String.valueOf(num);
        System.out.println(Integer.valueOf("1234"));
//        System.out.println(str.length());

        //3.way
//        int dig = (num+"").length();
    }
}
