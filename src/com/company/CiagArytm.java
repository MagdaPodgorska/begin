package com.company;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
import java.util.Date;

public class CiagArytm
{ static int wyrazn(int pierwszy_wyraz, int ilosc_wyrazow, int roznica)
{
    int wyrazn = 0;
    if(ilosc_wyrazow==1)
    {
        wyrazn=pierwszy_wyraz;

    }
    else
    {
        wyrazn=roznica+wyrazn(pierwszy_wyraz,ilosc_wyrazow-1,roznica);
    }
    return wyrazn;
}
    static int suma(int pierwszy_wyraz, int ilosc_wyrazow,int roznica)
    {
        int suma=0;
        for (int j=1;j<=ilosc_wyrazow;j++)
        {
            suma=j*(pierwszy_wyraz+wyrazn(pierwszy_wyraz,ilosc_wyrazow,roznica))/2;
        }
        return suma;
    }


    public static void main(String[] args)
    {

        for (;;) {
            int ilosc_wyrazow = 0;
            System.out.println("Ktory wyraz wyznaczyc?");
            Scanner odczyt = new Scanner(System.in);
            ilosc_wyrazow = Integer.valueOf(odczyt.nextLine());
            int roznica = 0;
            System.out.println("Podaj roznice");
            roznica = Integer.valueOf(odczyt.nextLine());
            int pierwszy_wyraz = 0;
            System.out.println("Podaj pierwszy wyraz");
            pierwszy_wyraz = Integer.valueOf(odczyt.nextLine());
            System.out.println(ilosc_wyrazow+" wyraz ciagu arytmetycznego wynosi "+ wyrazn(pierwszy_wyraz, ilosc_wyrazow,roznica));
            System.out.println("Suma "+ilosc_wyrazow+" kolejnych wyrazow ciagu arytmentycznego wynosi "+suma(pierwszy_wyraz,ilosc_wyrazow,roznica));
        }

    }
}