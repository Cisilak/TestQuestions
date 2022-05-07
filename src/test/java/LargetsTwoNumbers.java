public class LargetsTwoNumbers {
    public static void main(String[] args) {

        int[] nums = {100,5,38,9};

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num: nums) {
            if(num > firstMax){
                secondMax = firstMax;
                firstMax = num;

            }else if(num > secondMax){
                secondMax = num;
            }
        }

        System.out.println(firstMax + "  ----  " + secondMax);


    }
}
