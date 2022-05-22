import java.util.Arrays;

public class Converting2DimArrayTo1 {
    public static void main(String[] args) {
        //convert 2 dim to 1 and find the max number in this array
        int a[][] = {{15, 2}, {3, 13, 5}, {6, 7, 8, 9, 14}};
        int totalLength = 0;
        for (int[] w : a) {
            totalLength = totalLength + w.length;

        }
        System.out.println(totalLength);
        int b[] = new int[totalLength];
        int idx = 0;
        for (int[] w : a) {
            for (int x : w) {
                b[idx] = x; //b[0]=1, b[1]=2, b[8]=9
                idx++;
            }

//            for(int i=0; i<a.length;i++ ){
//                for(int j=0; j<a[i].length; j++){
//                    b[idx]=a[i][j];
//                    idx++;
//
//                }
//            }

        }
        System.out.println(Arrays.toString(b));
        //find the max number
//        int max = b[0];  //Integer.MIN_VALUE;
//        int secondMax = b[0];
//
//        for (int x : b) {
//            if (max < x) {
//                secondMax = max;
//                max = x;
//            }
//
//
//        }
//        Arrays.sort(b);
//        System.out.println(Arrays.toString(b));
//        System.out.println("max:" + b[b.length-1]);
//        System.out.println("secondMax:"+b[b.length-2]);
//        System.out.println("min:"+b[0]);

//        System.out.println(max);
//        System.out.println(secondMax);


        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int[]w:a){
            for(int x:w){
                if(x>max){
                    secondMax=max;
                    max=x;
                }
                else if(x>secondMax){
                    secondMax=x;
                }
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
    }
}







