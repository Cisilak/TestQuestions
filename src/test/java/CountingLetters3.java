public class CountingLetters3 {
    public static void main(String[] args) {
        String s = "abbcccdddd";

        char[] array = s.toCharArray();  //converts string to char array
        int count = 1;
        int max = 0;
        char maxChar = 0;  //'a'; default
        for(int i=0; i<array.length-1; i++){ // goes up to length-2 as it will compare with the next index
            if(array[i]==array[i+1]){
                count++;
            } else {
                if(count>max){  // Record current run length, is it the maximum?
                    max=count;
                    maxChar=array[i];
                }
                count = 1; // Reset the count
            }
        }
        if(count>max){
            max=count; // This is to account for the last run
            maxChar=array[array.length-1];
        }
        System.out.println("Longest run: "+max+", for the character "+maxChar); // Print the maximum.
    }
}
