public class PrimeNumber {
    public static void main(String[] args) {
   //     checkPrime(16);

        int num = 22;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                System.out.println("not a prime number");
        //        flag = true;
                break;
            }


        }System.out.println("prime");

//        if (!flag)
//            System.out.println(num + " is a prime number.");
//        else
//            System.out.println(num + " is not a prime number.");
    }



//    public static boolean checkPrime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//        for (int i = 2; i < Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                System.out.println("not prime");
//                return false;
//            }
//        }
//        System.out.println("prime");
//        return true;
//    }
}
