package Arrays;

public class ArrayBasics{
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6,7};

        // Indexing
        System.out.println(x[5]);   // Access

        // Updating Elements - Mutable i.e. Changeable
        x[3]=25;
        System.out.println(x[3]);

        int[] arr = new int[4];  // Array Of Length 4 i.e. 0 to 3 
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
    }
}