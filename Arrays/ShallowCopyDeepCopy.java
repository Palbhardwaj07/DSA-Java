package Arrays;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int a = 4;     // 4 Bytes Leta Hai Ye
        int[] arr = {10,20,30,40,50};     // 16 Bytes  // Continuous Or Contiguous Memory Allocation
        // int[] x = arr;     // x Is Shallow Copy Of arr
        // x[0] = 100;
        // System.out.println(arr[0]);

        int[] deep = Arrays.copyOf(arr,arr.length);     // Deep Copy     // Build In Method
        deep[0] = 100;
        System.out.println(arr[0]);


        // Deep Copy
        int[] brr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            brr[i] = arr[i];
        }
    }
}
