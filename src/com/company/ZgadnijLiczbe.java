package com.company;

import java.util.Random;
import java.util.Scanner;


public class ZgadnijLiczbe {


    public static void main(String[] args) {


        Random generator = new Random();
        int liczba = generator.nextInt(101);

        System.out.println("Zgadnij jako to liczba z zakresu 0-100");
        int strzal = 0;
        int licznik = 1;


        while (strzal != liczba) {
            Scanner odczyt = new Scanner(System.in);
            strzal = Integer.valueOf(odczyt.nextLine());
            licznik++;
            if (strzal < 0 || strzal > 100) {
                System.out.println("Podales zla liczbe");
            } else {
                if (strzal > liczba) {
                    System.out.println("To za duzo");
                } else if (strzal < liczba) {
                    System.out.println("To za malo");
                } else {
                    System.out.println("Brawo, trafiles");
                    System.out.println("Wygrywasz w " + licznik + " probie");
                }

            }


        }

    }
}
