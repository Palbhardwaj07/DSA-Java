package Arrays;
import java.util.Arrays;
public class SortArrayBuiltIn {
    public static void main(String[] args) {
        
        // Sort - Ascending Order
    int[] arr = {10,80,5,22,76,34,17,28};
    print(arr);
    Arrays.sort(arr);
    print(arr);

    }
    public static void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
