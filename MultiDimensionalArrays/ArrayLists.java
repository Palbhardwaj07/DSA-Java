package MultiDimensionalArrays;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3); a.add(6); a.add(9); a.add(12);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(5); b.add(15); b.add(50);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(2); c.add(52); c.add(25); c.add(58); c.add(56); 

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c);

        System.out.println(arr);

        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }


        arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(10); arr.get(arr.size()-1).add(20);

        for(ArrayList<Integer> list : arr){
            for(int ele : list){
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }
}
