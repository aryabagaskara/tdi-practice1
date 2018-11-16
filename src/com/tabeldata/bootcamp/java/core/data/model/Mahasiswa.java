package com.tabeldata.bootcamp.java.core.data.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.tabeldata.bootcamp.java.core.data.model.kelas;

public class Mahasiswa {
    private String nim, nama;
    private LocalDate tanggalLahir;
    private Integer angkatan;
    private kelas KZL;
    
    public Mahasiswa(String nim,String nama, LocalDate tanggalLahir, Integer angkatan, Kelas kelas){
        this.nim = nim;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.angkatan = angkatan;
        this.kelas = kelas;
    }

    public static void main(String[] args) {
        List<Mahasiswa> liz = new ArrayList<>();
        kelas KelasIF = new kelas("S1",2008,"IF");
        kelas KelasSI = new kelas("D3",2001,"SI");

        liz.add("11233232","passku",2018,2002,KelasIF);

        

    }
    
}