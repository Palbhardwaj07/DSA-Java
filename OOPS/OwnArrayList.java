package OOPS;
import java.util.*;


class ArrayList{
    int[] arr;
    int idx = 0;
    int size = 0;
    ArrayList(int capacity){
        arr = new int[capacity];
    }

    void add(int ele){
        if(idx == arr.length){
            capacityIncrease();
        }
        arr[idx++] = ele;
        size++;
    }

    void removeFromEnd() {
    if (size == 0) {
        System.out.println("ArrayList is empty");
        return;
    }
    idx--;
    size--;
    }

    void remove(int index) {
    if (index < 0 || index >= size) {
        System.out.println("Invalid Index");
        return;
    }
    for (int i = index; i < size - 1; i++) {
        arr[i] = arr[i + 1];
    }
    idx--;
    size--;
    }

    void insert(int index, int val) {
    if (index < 0 || index > size) {
        System.out.println("Invalid Index");
        return;
    }
    if (size == arr.length) {
        capacityIncrease();
    }
    for (int i = size; i > index; i--) {
        arr[i] = arr[i - 1];
    }
    arr[index] = val;
    idx++;
    size++;
    }

    void capacityIncrease(){
        int[] arr2 = new int[arr.length*2];
            for(int i=0;i<arr.length;i++){
                arr2[i] = arr[i];
            }
            arr = arr2;
    }

    int capacity(){
        return arr.length;
    }

    int get(int index){
        return arr[index];
    }

    void set(int index, int val){
        arr[index] = val;
    }

    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class OwnArrayList {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(8);
        // System.out.println(arr.capacity());
        System.out.println(arr.size);
        arr.add(5); arr.add(10); arr.add(15);
        System.out.println(arr.size);
        arr.display();
        System.out.println(arr.get(1));

        arr.add(20);
        arr.display();

        arr.insert(2, 100);
        arr.display();

        arr.remove(3);
        arr.display();

        arr.removeFromEnd();
        arr.display();
    }
}
