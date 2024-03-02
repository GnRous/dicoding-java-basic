package com.dicoding.javafundamental.propertimethod;

public class Hewan {

    //properti atau fields
    //Inisiasi dengan nilai Inisial
    double tinggi = 30;
    double berat = 3;

    // Inisiasi melalui konstruktor
    int umur;

    // Konstruktor dengan parameter
    Hewan(int umur) {
        this.umur = umur;
    }

    void lari(){
        System.out.println("Berlari dengan sangat cepat...");
    }

    void jalan(){
        System.out.println("Berjalan dengan pelan..");
    }

    void makan(){
        System.out.println("Makan dengan menggunakan mulut..");
    }

    double getBerat() {
        return berat;
    }

    double getTinggi() {
        return tinggi;
    }

    int getumur() {
        return umur;
    }
}
