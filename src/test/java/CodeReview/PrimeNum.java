package CodeReview;

public class PrimeNum {
    public static void main(String[] args) {
        int num = 5;

        for(int i=2; i<num; i++){
            if(num%i==0){  //11/3
                System.out.println("not prime");
                break;
            }
            System.out.println("prime");
            break;
        }

    }
}

