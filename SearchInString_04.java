package com.Atif;

public class SearchInString_04 {
    static boolean search(String str, char a){
        if(str.length() == 0){
            return false;
        }

        for(char chr : str.toCharArray()){
            if(chr == a)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String name = "Atiful";
        char target = 't';
        System.out.println(search(name,target));
    }
}
