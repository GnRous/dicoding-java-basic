package com.dicoding.javafundamental.bangundatar;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Main {
    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //kamus
        PersegiPanjang opersegi;
        SegitigaSiku osegitga;
        Lingkaran olingkaran;
        int s1, s2, r;

        opersegi = new PersegiPanjang();
        osegitga = new SegitigaSiku();
        olingkaran = new Lingkaran();

        //persegi
        //Panggil methode
        mainMenu();

        //Kondisional untuk pilihan menu yang dimasukkan
        switch (pilihan) {
            case '1': {
                System.out.print("Masukkan panjang persegi: ");
                s1 = scanner.nextInt();
                System.out.print("Masukkan lebar persegi: ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang: " + opersegi.luas(s1,s2));
                System.out.println("Keliling persegi panjang: " + opersegi.keliling(s1,s2));
                break;
            }
            case '2': {
                System.out.print("Masukkan alas segitiga siku: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan tinggi segitiga siku: ");
                s2 = scanner.nextInt();
                System.out.println("Luas segitiga: " + osegitga.luas(s1,s2));
                System.out.println("Keliling segitiga: " + osegitga.keliling(s1,s2));
                break;
            }
            case '3': {
                System.out.print("Masukkan jari-jari lingkaran: ");
                r = scanner.nextInt();
                System.out.println("Luas Lingkaran: " + olingkaran.luas(r));
                System.out.println("Keliling Lingkaran: " + olingkaran.keliling(r));
                break;
            }
            default: {
                System.out.println("tidak ada pilihan");
                break;
            }
        }
    }

    private static void mainMenu() {
        //pilihan menu
        System.out.println("=============================");
        System.out.println("hitung Luas dan Keliling :");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan Menu : ");
        pilihan = scanner.next().charAt(0);
    }
}
