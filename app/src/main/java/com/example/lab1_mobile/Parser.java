package com.example.lab1_mobile;

import java.util.regex.Pattern;

public class Parser {

    private static int meanCounter;
    private static int numCounter;
    private String value;

    public static boolean check(String value){
        reset();
        Pattern pattern = Pattern.compile("[ ]");
        String[] numStorage = pattern.split(value);
        for(String iter : numStorage){
            if(iter.charAt(0) > 47 && iter.charAt(0) < 58){
                numCounter++;
            }
            else if(iter.charAt(0) == '(' || iter.charAt(0) == ')'){
                continue;
            }
            else{
                meanCounter++;
            }
        }
        return numCounter >= meanCounter;
    }

    public static String getAllMembers(String value){
        Pattern pattern = Pattern.compile("[ ]");
        String[] values = pattern.split(value);
        for(int i = 0; i < values.length; i ++ ){
            if(values[i].contains("√")){
                values[i] = "Math.sqrt";
            }
        }
        return concat(values);
    }

    private static String concat(String[] values){
        StringBuilder stringBuilder = new StringBuilder();
        for(String iter : values){
            stringBuilder.append(iter);
        }
        return stringBuilder.toString();
    }


    private static void reset(){
        meanCounter = 0;
        numCounter = 0;
    }
}
