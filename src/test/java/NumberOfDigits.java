import java.util.Arrays;

public class
NumberOfDigits {
    public static void main(String[] args) {
        int a = 1234567;
//1st way
        int num1 = (""+a).length(); //(a+"")
        System.out.println(num1);

//2nd way
        String str = Integer.toString(a);//converted integer to string
        int num = str.length();
        System.out.println(num);

        //3rd way
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

//4th way
             int count =0;
        while(a!=0){ //234 //23//2//0stop
            a = a/10; // 23.4 =23 //2.3=2//0.2=0
            count++; //1//2//3

        }
        System.out.println("number of digits is: "+count);
    }
}
