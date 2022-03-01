package com.Atif;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(550);
//        list.add(15);
//        list.add(781);
//        list.add(8789);
//        list.add(575);

//        System.out.println(list); -> we can print Arraylist directly

//        System.out.println(list);

//        list.remove(0); removes the value from the index

//        list.set(0,100); replaces the element at the index with 100

//        System.out.println(list);

        //input

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
//        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }


    }
}
