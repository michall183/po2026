package lab.src.main.java.agh.po.lab4.zadania;

import lab.src.main.java.agh.po.lab4.animals.*;
import java.util.Random;

public class Zoo {
    Animal[] animals = new Animal[100];

    public void fillradom(){
        Random generator = new Random();
        for (int i = 0; i < animals.length; i++) {
            int type = generator.nextInt(2);
            switch (type) {
                case 0:
                    System.out.println(1);
                case 1:
                    System.out.println(2);
                case 2:
                    System.out.println(3);
            }
        }
    }
}
