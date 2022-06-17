package CodeReview;

import java.util.stream.IntStream;

public class Lambda3 {
    public static void main(String[] args) {
     System.out.println(add());

        int sum=0;
        for(int i=7; i<=10; i++){
            sum=sum+i;
        }
        System.out.println(sum);

        System.out.println(IntStream.rangeClosed(3,5).reduce(1, Math::multiplyExact));

//  int sum =   IntStream.rangeClosed(7,9).reduce(0, Math::addExact);
//        System.out.println(sum);
    }
    public static int add(){
        return IntStream.rangeClosed(7,9).reduce(0, Math::addExact);
    }




}

