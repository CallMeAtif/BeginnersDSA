package com.Atif;
import java.util.Arrays;

public class SearchIn2DArray {
    static int[] search(int [][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int [][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] [] arr = {
                {24, 4, 78, 6},
                {42, 18, 30},
                {32, 64, 96}
        };
//        int target = 64;
//        int [] ans = search(arr, target);
//        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));

    }
}
