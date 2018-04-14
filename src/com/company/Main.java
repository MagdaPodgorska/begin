package com.company;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
import java.util.Date;

public class Main {


    public static void main(String[] args)
    {


        Date date = new Date();
        int rok= date.getYear()+1900;
        int miesiac=date.getMonth()+1;
        int dzien= date.getDate();

//
//        System.out.println("podaj rok urodzenia");
//        Scanner odczyt = new Scanner(System.in);
//        int rok1 = Integer.valueOf(odczyt.nextLine());
//        System.out.println("podaj miesiac urodzenia");
//        int miesiac1 = Integer.valueOf(odczyt.nextLine());
//        System.out.println("podaj dzien urodzenia");
//        int dzien1 = Integer.valueOf(odczyt.nextLine());
//        System.out.print(rok+miesiac+dzien);
//        if(rok-rok1>18)
//        {
//            System.out.println("jestes pelnoletni");
//        }
//        else if (rok-rok1<18)
//        {
//            System.out.println("jestes niepelnoletni");
//        }
//        else
//        {
//            if(miesiac-miesiac1>0)
//            {
//                {
//                    System.out.println("jestes pelnoletni");
//                }
//            }
//            else if(miesiac-miesiac1<0)
//            {
//                System.out.println("jestes niepelnoletni");
//            }
//            else
//            {
//                if(dzien-dzien1>0)
//                {
//                    System.out.println("jestes pelnoletni");
//                }
//                else if (dzien-dzien1<0)
//                {
//                    System.out.println("jestes niepelnoletni");
//                }
//                else
//                {
//                    System.out.println("dzis sa twoje urodziny");
//                }
//            }
//        }
//
//
    }

}