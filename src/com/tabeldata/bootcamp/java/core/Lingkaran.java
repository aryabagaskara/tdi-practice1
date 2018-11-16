package com.tabeldata.bootcamp.java.core;

import java.lang.Math;

public class Lingkaran{
    public static void main(String[] args) {
        Integer jariJari = 15;
        Integer diameter = jariJari * 2;
        Double Keliling =  Math.PI * diameter;
        System.out.println(
            "Nilai PI "
            +Math.PI+
            ", maka kelilingnya adalah "
            +Keliling
        );
    }
}