package CodeReview;

public class Fibinacci {
    public static void main(String[] args) {
       int t1=0;
       int t2=1;

//
        int i=1;
        while(i<=10){
            System.out.print(t1+" ");
            int sum=t1+t2;
            t1=t2;
            t2=sum;
            i++;
        }

    }
}
