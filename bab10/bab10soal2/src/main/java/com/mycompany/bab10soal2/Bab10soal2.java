/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab10soal2;

/**
 *
 * @author PC RPL - R1
 */
public class Bab10soal2 {

    public static void main(String[] args) {
        Bab10soal2 outer = new Bab10soal2();
        
        Aritmatika aritmatika = new Aritmatika();

        int bilangan1 = 15;
        int bilangan2 = 3;

        int hasilPengurangan = aritmatika.pengurangan(bilangan1, bilangan2);
        System.out.println("Hasil Pengurangan: " + bilangan1 + " - " + bilangan2 + " = " + hasilPengurangan);

        int hasilPerkalian = aritmatika.perkalian(bilangan1, bilangan2);
        System.out.println("Hasil Perkalian: " + bilangan1 + " * " + bilangan2 + " = " + hasilPerkalian);

        double hasilPembagian = aritmatika.pembagian(bilangan1, bilangan2);
        System.out.println("Hasil Pembagian: " + bilangan1 + " / " + bilangan2 + " = " + hasilPembagian);

        double hasilPangkat = aritmatika.pangkat(bilangan1, bilangan2);
        System.out.println("Hasil Pangkat: " + bilangan1 + " ^ " + bilangan2 + " = " + hasilPangkat);
    }
}