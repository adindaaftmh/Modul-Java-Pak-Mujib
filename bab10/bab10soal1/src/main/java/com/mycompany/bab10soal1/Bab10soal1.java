/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab10soal1;

/**
 *
 * @author PC RPL - R1
 */
public class Bab10soal1 {

    public static void main(String[] args) {
        aritmatika aritmatika = new aritmatika();
        
        
        int bilangan1 = 50;
        int bilangan2 = 2;
        
        int hasilpengurangan = aritmatika.pengurangan(bilangan1, bilangan2);
        int hasilperkalian = aritmatika.perkalian(bilangan1, bilangan2);
        double hasilpembagian = aritmatika.pembagian(bilangan1, bilangan2);
        double hasilpangkat = aritmatika.pangkat(bilangan1, bilangan2);
        
        
        System.out.println("Hasil pengurangan: " + hasilpengurangan);
        System.out.println("Hasil perkalian: " + hasilperkalian);
        System.out.println("Hasil pembagian: " + hasilpembagian);
        System.out.println("Hasil pangkat " + hasilpangkat);
 
    }
}