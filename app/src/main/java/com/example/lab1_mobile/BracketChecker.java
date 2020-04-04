package com.example.lab1_mobile;

public class BracketChecker{

    private static ConsumtionStack consumtionStack;

    public static boolean check(String value){
        consumtionStack = new ConsumtionStack(value.length());
        for(int i = 0; i < value.length(); i++){
            if(value.charAt(i) == '('){
                consumtionStack.push("(");
            }
            if(value.charAt(i) == ')' &&  consumtionStack.peek().equals("(")){
                consumtionStack.pop();
            }
        }
        return consumtionStack.isEmpty();
    }
}
