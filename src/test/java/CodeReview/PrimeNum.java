package CodeReview;

public class PrimeNum {
    public static void main(String[] args) {
        int num = 19;

        for(int i=2; i<Math.sqrt(num); i++){
            if(num%i==0){
                System.out.println("not prime");
                break;
            }
            System.out.println("prime");
            break;
        }

    }
}

