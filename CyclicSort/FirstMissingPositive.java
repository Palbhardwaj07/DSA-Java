package CyclicSort;

import java.util.Scanner;

public class FirstMissingPositive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int i = 0;
        while (i < nums.length) {
            if (nums[i] > 0 &&
                nums[i] <= nums.length &&
                nums[i] != nums[nums[i] - 1]) {

                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[nums[i] - 1] = temp;

            } else {
                i++;
            }
        }
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(nums.length + 1);
    }
}