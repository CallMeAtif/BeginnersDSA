package com.Atif;

public class OrderAgnosticBS {
    static int orderAgnosticBS(int [] arr, int target){
        int start = 0;
        int end = arr.length -1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] == target)
                return mid;

            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid -1;
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] num = {-12, -9, -7, -3, 0, 12, 14, 23, 26, 69, 72, 85, 96, 100};
        int target = 26;
        int a = orderAgnosticBS(num, target);
        System.out.println(a);
    }
}
