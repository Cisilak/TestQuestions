public class StaticBlock {



    public static void main(String[] args) {
        System.out.println("main");

       }
    static int i =10;
   // int j;
    static {
       // i=10;
        System.out.println(i);
        System.out.println("static block");
    }
}
