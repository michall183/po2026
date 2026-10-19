
package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;


public class zad3 {
    public static void main(String[] args) {

        double start_time = System.currentTimeMillis();
        ArrayList<Integer> list_lotto = new ArrayList<>();
        ArrayList<Integer> list_drawn = new ArrayList<>();
        int liczba_trafien = 0;
        Random randomNumbers = new Random();
        int number_of_rep = 0;

        while(liczba_trafien !=6){
            number_of_rep ++;
            //reset zmiennych
            list_lotto.clear();
            list_drawn.clear();
            liczba_trafien = 0;




            for(int i = 0; i <= 5; ){
                int a = randomNumbers.nextInt(48)+1;
                if (!list_lotto.contains(a)){
                    i++;
                    list_lotto.add(a);
                }

            }

            for(int i = 0; i <= 5; ){
                int a = randomNumbers.nextInt(48)+1;
                if (!list_drawn.contains(a)){
                    i++;
                    list_drawn.add(a);
                }

            }

            for(int i = 0; i <= 5; i++) {
                if(list_drawn.contains(list_lotto.get(i))) {
                    liczba_trafien ++;
                }
                else{
                    break;
                }
            }
        }
        double end_time = System.currentTimeMillis();
        System.out.println("czas działania =" + (end_time - start_time));
        System.out.println("liczba powtórzeń =" + (number_of_rep));
        System.out.println("czas/powtorzenia= "+ ((end_time - start_time)/number_of_rep));
        System.out.println("Trafiony los:"+list_drawn +", lotto:"+ list_lotto);
}}

