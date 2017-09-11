package com.suru.test;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "jookooj";
        System.out.println(new StringBuffer(str).reverse().toString().equals(str));
    }

    boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
