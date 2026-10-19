
package agh.po.lab2;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class lotto {
    public static void main(String[] args) {
        int liczba_trafien = 0;
        Random randomNumbers = new Random();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);



        for(int j = 1; j <= 6; j++) {
            System.out.println("podaj los nr" + j);
            int a = Integer.parseInt(scan.nextLine());
            list2.add(a);
        }
        System.out.print("twoje liczby :" + list2);

        for(int i = 0; i <= 5; ){
            int a = randomNumbers.nextInt(48)+1;
            if (!list1.contains(a)){
                i++;
                list1.add(a);
            }

        }
        System.out.print("wylosowane liczby "+ list1);

        for(int j = 0; j <= 5; j++) {
            for(int i = 0; i <= 5; i++){
                if(list1.get(i)==list2.get(j)){
                    liczba_trafien++;
                }
            }
        }

        System.out.println("liczba trafień =" + liczba_trafien);
}}

