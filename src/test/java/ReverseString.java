public class ReverseString {
    public static void main(String[] args) {

        String str = "abbccddf";
        String s = "";

        for (int i=str.length()-1; i>=0; i--){
            String x = str.substring(i, i+1);
            if(!s.contains(x)){
                s=s+x;

            }
        }
        System.out.println(s);
    }
}
