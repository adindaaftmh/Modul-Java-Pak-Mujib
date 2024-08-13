/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bab10soal2;

/**
 *
 * @author PC RPL - R1
 */
public class Aritmatika {
  public int pengurangan(int bilangan1, int bilangan2) {
            return bilangan1 - bilangan2;
        }

        public int perkalian(int bilangan1, int bilangan2) {
            return bilangan1 * bilangan2;
        }

        public double pembagian(int bilangan1, int bilangan2) {
            if (bilangan2 != 0) {
                return (double) bilangan1 / bilangan2;
            } else {
                System.out.println("Error: Pembagian dengan nol!");
                return 0;
            }
        }

        public double pangkat(int bilangan1, int bilangan2) {
            return Math.pow(bilangan1, bilangan2);
        }
    }
