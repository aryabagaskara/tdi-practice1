package com.tabeldata.bootcamp.java.core;



public class PersegiPanjang{
    public static Integer panjang, tinggi;
    public static void main(String[] args) {
        panjang= 10;
        tinggi = 5;
        Integer luas = new Integer(panjang*tinggi);
        System.out.println(
            "Tinggi "
            +tinggi+
            "cm, dan Panjang "
            +panjang+
            "cm. Maka luas persegi panjang adalah "
            +luas+
            "cm"
        );
    }
}