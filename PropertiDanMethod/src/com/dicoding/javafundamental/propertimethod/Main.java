package com.dicoding.javafundamental.propertimethod;

public class Main {
    public static void main(String[] args) {

        // Kita tambahkan 1 argumen dengan nilai int 2
        // Nilai tersebut adalah nilai yang digunakan untuk inisiasi variabell umur
        Hewan kucing = new Hewan(2);
        kucing.makan();
        kucing.lari();
        kucing.jalan();

        //contoh penggunaan fungsi getUmur
        System.out.println("Umurnya adalah " + kucing.getumur());

        // Perhitungan indeks massa tubuh (BMI)
        // berat(kg) / ( tinggi(m) * tinggi(m) )
        double bmi = kucing.getBerat() / ((kucing.getTinggi() * 0.01) * (kucing.getTinggi() * 0.01));
        System.out.println("Indek massa tubuhnya adalah " + bmi);
    }
}
