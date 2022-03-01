package com.Atif;
import java.util.HashMap;
import java.util.Arrays;

public class twosum {
    static int[] solution(int [] num,int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int compliment = target - num[i];

            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment),i};
            }
            map.put (num[i], i);
        }
        throw new IllegalArgumentException("no match found");
    }
    public static void main(String[] args){
        int [] arr = {2,7,1,8};
        int target = 9;
        System.out.println(Arrays.toString(solution(arr,target)));
    }
}
