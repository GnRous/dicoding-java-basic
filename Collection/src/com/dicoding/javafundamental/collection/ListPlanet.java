package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {

    public static void main(String[] args) {
//        deklarasi Array
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";
//        heroes[2] = "zeus"; //error ArrayIndexOutOfBoundsException arena ukuran Array tetap
        System.out.println(heroes[0] + " " + heroes[1]);

//        menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("mercury"); //method add() untuk menambahkan objek ke List
        planets.add("venus");
        planets.add("earth");
        planets.add("mars"); // objek lainnya masih bisa terus ditambahkan ke List
        planets.add("mercury");

        System.out.println("List planets awal : ");
        for (int i = 0; i < planets.size(); i++) {
            // method size() untuk mendapatkan ukuran List
            // method get() untuk melihat isi List pada index i
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }

        planets.remove("venus"); // method remove() untuk mengeluarkan objek dari List

        System.out.println("List Planets akhir : ");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }
    }
}
