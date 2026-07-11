package Sorting;

import java.util.*;
public class SelectionSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int Index_min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    Index_min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[Index_min];
            arr[Index_min]=temp;
        }
    }
    public static void main(String[] args){
        int[]arr={1,5,0,6,3,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}