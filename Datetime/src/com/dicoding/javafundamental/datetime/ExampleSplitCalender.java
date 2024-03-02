package com.dicoding.javafundamental.datetime;

import java.util.Calendar;

public class ExampleSplitCalender {
    public static void main(String[] args) {
        // menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());

        // Menampilkan spesifik waktu yang diinginkan
        System.out.println("Tanggal : " + calendar.get(Calendar.DATE));
        System.out.println("Bulan : " + calendar.get(Calendar.MONTH));
        System.out.println("Tahun : " + calendar.get(Calendar.YEAR));
    }
}
