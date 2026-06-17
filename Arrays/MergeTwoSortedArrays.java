package Arrays;

import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3 Pointer Technique

        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for(int i=0;i<n1;i++){
            a[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for(int i=0;i<n2;i++){
            b[i] = sc.nextInt();
        }

        int [] c = new int[a.length + b.length];
        merge(c,a,b);
        for(int ele : c) System.out.print(ele + " ");
    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k] = a[i];     // c[k++] = a[i++];
                i++;
                k++;
            }
            else{
                c[k] = b[j];     // c[k++] = b[j++];
                j++;
                k++;
            }
        }
        // if(i==a.length){     // a Finish b Is Left
            while(j<b.length){
                c[k++] = b[j++];
            }
        // }
        // if(j==b.length){     // b Finish a Is Left
            while(i<a.length){
                c[k++] = a[i++];
            }
        //}
    }
}
