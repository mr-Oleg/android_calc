package com.example.lab1_mobile;

public class MeanChecker {

    public static boolean check(String value) {
        char temp = value.charAt(value.length()-1);
        if(temp == '*' || temp == '/' || temp == '-' || temp == '+' || temp == '.' || temp == '('){
            return false;
        }
        return true;
    }
}
