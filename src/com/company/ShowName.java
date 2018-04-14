package com.company;


import java.util.Scanner;

public class ShowName {


    public static void main(String[] args) {
        System.out.println("Podaj imie");
        Scanner odczyt = new Scanner(System.in);
        String imie = odczyt.nextLine();
        System.out.println(imie);


    }
}
