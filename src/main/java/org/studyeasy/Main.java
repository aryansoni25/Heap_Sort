package org.studyeasy;

public class Main {
    public static void main(String[] args) {
        int arr[]={2,7,3,1,4,8,9};
        HeapSort hp=new HeapSort(arr);
        hp.sort();
        hp.printArray(arr);
    }
}