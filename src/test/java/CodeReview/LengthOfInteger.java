package CodeReview;

public class LengthOfInteger {
    public static void main(String[] args) {
        int a = 12345;

    String s = ""+a;
        System.out.println(s.length());


        int counter = 0;
        while(a>0){
            a=a/10;
            counter++;

        }
        System.out.println(counter);


    }
}
