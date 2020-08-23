package org.example;

public class SalesRepresentative {
    void bubbleSort(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n-1; i++) {
            while (j < (n-i)-1) {
                if (arr[j] < arr[j+1]) { //if arr[j]>arr[j+1]==>>ascending order
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                j++;
            }
        }
    }
    void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


}
