public class LargestNumber2 {
    public static void main(String[] args) {
        int[] a = {19, 56, 987, -100, 76};
//        Solution First  - O(nlogn)
//        Arrays.sort(nums);
//        System.out.println(nums[nums.length-1]);


        //Soluton Second
//        int max = arr[0];
// {6,20,10,87}
        //Solution 3
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println(a[a.length-1]);

    }
}
