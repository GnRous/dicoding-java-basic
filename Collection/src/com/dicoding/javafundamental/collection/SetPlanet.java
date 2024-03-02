package com.dicoding.javafundamental.collection;

import java.util.*;

public class SetPlanet {
    public static void main(String[] args) {
//        Menggunakan HashSet
        Set<String> planets = new HashSet<>();
        planets.add("Venus");
        planets.add("Mars");
        planets.add("Mercury"); // method add() untuk menambahkan objek ke Set
        planets.add("Earth");
        planets.add("Earth"); // menambahkan objek "earth" beberapa kali
        planets.add("Mercury"); // objek bisa terus di tambahkan ke Set

        // method size() untuk mendapatkan ukuran Set
        System.out.println("Set planets awal: (size = " + planets.size() + ")");
        for (String planet : planets) {
            System.out.println("\t " + planet);
        }

        planets.remove("Mars"); // method remove() untuk mengeluarkan objek dari Set

        System.out.println("Set planets akhir: (size = " + planets.size() + ")");
        for (Iterator iterator = planets.iterator(); iterator.hasNext(); ) {
            // Looping menggunakan Iterator
            System.out.println("\t" + iterator.next());
        }
    }
}
