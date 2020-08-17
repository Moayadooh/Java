package com.moayad.tools;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalClass {
    public static void main(String[] args) {
        BigDecimal num = new BigDecimal(6.76);
        System.out.println(num);
        System.out.println(num.setScale(2, RoundingMode.HALF_UP));

        //double a = 2 * amount; //Not allowed
        BigDecimal sum = BigDecimal.valueOf(2).multiply(num);
        System.out.println(sum);

        BigDecimal bigDecimal1 = new BigDecimal("2.00");
        BigDecimal bigDecimal2 = new BigDecimal("2.0");
        System.out.println(bigDecimal1.equals(bigDecimal2)); //Don't use 'equals()'
        System.out.println(bigDecimal1.compareTo(bigDecimal2));
    }
}
