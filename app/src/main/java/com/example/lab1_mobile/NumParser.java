package com.example.lab1_mobile;

import java.math.BigDecimal;

public class NumParser {

    public static double castToDouble(String value){
        if(primaryCheck(value)){
            return Double.parseDouble(value);
        }
        return Double.NaN;
    }

    private static boolean primaryCheck(String value){
        for(int i = 0; i < value.length(); i++){
            if(!((value.charAt(i) > 47 && value.charAt(i) < 58) || value.charAt(i) == 46)){
                return false;
            }
        }
        return true;
    }

    private static BigDecimal castToBigDecimal(String value){
        if(primaryCheck(value)){
            return new BigDecimal(value);
        }
        return BigDecimal.valueOf(Double.NaN);
    }
}
