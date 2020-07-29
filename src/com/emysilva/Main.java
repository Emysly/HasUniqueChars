package com.emysilva;

public class Main {
    public static boolean hasUniqueChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(str.lastIndexOf(str.charAt(i)) != i) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasUniqueChars("madam"));
    }
}
