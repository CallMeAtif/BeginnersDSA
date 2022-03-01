package com.Atif;

public class SearchInRange_05 {

    static int searchInRange(int [] arr ,int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for (int index = start; index <= end; index++) {
            if(arr[index] == target)
                return index;
        }
        return -1;

    }
    public static void main(String[] args) {
        int [] arr = {23, 41, 55, 37, 65, 90};
        int target = 65;
        System.out.println(searchInRange(arr, target,1,4));
    }
}
