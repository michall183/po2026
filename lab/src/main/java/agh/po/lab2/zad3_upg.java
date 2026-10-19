
package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;


public class zad3_upg {
    public static void main(String[] args) {


        ArrayList<Integer> list_lotto = new ArrayList<>();
        ArrayList<Integer> list_drawn = new ArrayList<>();
        ArrayList<Double> list_time = new ArrayList<>();
        int liczba_trafien = 0;
        Random randomNumbers = new Random();
        int number_of_rep = 0;

        for(int j = 0; j<=10; j++){
            list_lotto.clear();
            list_drawn.clear();
            liczba_trafien = 0;
            double start_time = System.currentTimeMillis();

            while(liczba_trafien != 6){
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


                if(!list_drawn.retainAll(list_lotto)) {
                    liczba_trafien = 6;
                    break;
                }

            }
            double end_time = System.currentTimeMillis();
            list_time.add((end_time-start_time));
        }
        ;

}}

