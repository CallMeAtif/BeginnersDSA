package com.Atif;
import java.util.HashMap;

public class hashMap_06 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
//        map.put("Atif",123);
//        map.put("Parvez",456);
//        map.put("Arman", 789);
//        map.put("Abdullah1",100);
//        map.put("Abdullah2",100);

//        if (map.containsValue(100)){
//            System.out.println(map);
//        }

        map.put(1,3);
        map.put(2,4);
        if(map.containsKey(1)){
            System.out.println(map);
        }
//        System.out.println(map.containsKey("Atif"));
//        System.out.println(map.containsValue(123));
//        for(int element: map.values()){
//            System.out.println(element);
//        }
//        System.out.println(map.get(123));
    }
}
