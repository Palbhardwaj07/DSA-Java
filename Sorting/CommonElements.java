package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for(int i=0;i<b.length;i++){
            b[i] = sc.nextInt();
        }
        int i=0, j=0;
        Arrays.sort(a);     // nlogn
        Arrays.sort(b);     // nlogm
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<a.length && j<b.length){     // n+m
            if(a[i] == b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]) i++;
            else if(b[j]<a[i]) j++;
        }
        System.out.println(ans);
    }
}
