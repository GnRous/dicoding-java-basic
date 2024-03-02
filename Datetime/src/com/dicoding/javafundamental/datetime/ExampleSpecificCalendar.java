package com.dicoding.javafundamental.datetime;

import java.util.Calendar;

public class ExampleSpecificCalendar {
    public static void main(String[] args) {

        // Menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());

        // menampilkan waktu 15 hari yang lalu
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 hari yang lalu: " + calendar.getTime());

        // Menampilkan waktu 4 bulan yang akan datang
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 bulan kemudian: " + calendar.getTime());

        // Menampilkan waktu 2 tahunu yang akan datang
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 Tahun kemudian: " + calendar.getTime());
    }
}
