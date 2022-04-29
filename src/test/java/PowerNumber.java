public class PowerNumber {
    public static void main(String[] args) {
        int base = 2, exponent=5;
        long result = 1;
        while(exponent!=0){
            result=result*base;
            --exponent;  //describes the number of turns
            System.out.println(result);
        }
//        for (int i=1; i<=exponent; i++){
//            result=result*base; //1x2=2, 2x2=4, 4x2=8, 8x2=16, 16x2=32
//
//        }
        System.out.println("answer =" +result);
    }
}
