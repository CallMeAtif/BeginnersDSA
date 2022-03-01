package com.Atif;

public class BinarySearch_09 {
    static int binarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target< arr[mid]){
                end = mid -1;
            }
            else
                return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] num = {-12, -9, -7, -3, 0, 12, 14, 23, 29, 35, 37, 39, 42, 46, 49, 50, 53, 57, 59, 69, 72, 85, 96, 100};
        int target = 69;
        System.out.println(binarySearch(num, target));
    }
}
