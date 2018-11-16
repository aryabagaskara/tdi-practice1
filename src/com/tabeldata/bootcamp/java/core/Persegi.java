package com.tabeldata.bootcamp.java.core;

public class Persegi{
    public static void main(String[] args){
        Double sisi = 50d;
        Double luasMeter = (sisi * sisi) / 100;
        System.out.println(
            "Dengan sisi "
        +sisi.intValue()+
        "cm maka luas persegi tersebut adalah "
        +luasMeter.intValue()+
        "m"        
        );
    }
}