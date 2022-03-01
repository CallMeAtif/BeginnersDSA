package com.Atif;


public class linearSearch_03 {
    static int LinearSearch(int [] arr ,int target){
        if(arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if(arr[index] == target)
                return index;
        }
        return -1;

    }

    public static void main(String[] args) {
        int [] num = {12, 45, 78, 95, 47, 63, 89, 69, 35, 16};
        int target = 69;
        System.out.println(LinearSearch(num,target));

    }
}
