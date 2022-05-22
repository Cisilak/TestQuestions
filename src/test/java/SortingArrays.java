import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {

        int [] arr = {4,2,1,3,7,9,6};
        int temp;

        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i]>=arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
