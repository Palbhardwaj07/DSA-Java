package Arrays;

import java.util.ArrayList;

public class ArrayListInJavaBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(); 
        
        // ArrayList<Character> arr = new ArrayList<>();
        // ArrayList<Double> arr = new ArrayList<>();
        // ArrayList<String> arr = new ArrayList<>();

        arr.add(5);
        arr.add(10);
        arr.add(15);
        arr.add(20);
        arr.add(25);

        System.out.println(arr.get(2));     // arr[2]
        arr.set(3,50);     // arr[3] = 50
        
        System.out.println(arr);     // Not Traversing The Array By Ourselves

        int n = arr.size();     // arr.length
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i) + " ");
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }

        // 5 10 15 50 25
        arr.add(30);     // 5 10 15 50 25 30
        arr.add(1,100);     // 5 100 10 15 50 25 30
        arr.remove(2);
        arr.remove(arr.size() - 1);     // Remove Last Element
        System.out.println(arr);

        // zreverse ArrayList
        int i = 0, j = arr.size() - 1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        // Collections.reverse(arr);     // Reverse Array List
        System.out.println(arr);
    }
}
