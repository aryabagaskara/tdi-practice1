package com.tabeldata.bootcamp.java.core.data.model;

public class kelas{
    private String nama;
    private Integer tahunAjaran;
    private String jurusan;

    public kelas(String nama, Integer tahunAjaran, String jurusan){
        this.nama=nama;
        this.tahunAjaran=tahunAjaran;
        this.jurusan=jurusan;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getTahunAjaran() {
        return this.tahunAjaran;
    }

    public void setTahunAjaran(Integer tahunAjaran) {
        this.tahunAjaran = tahunAjaran;
    }

    public String getJurusan() {
        return this.jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public static void main(String[] args) {
        
    }


}