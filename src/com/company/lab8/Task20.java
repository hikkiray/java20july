package com.company.lab8;
import java.util.Scanner;
public class Task20 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        System.out.print("Введите первый массив");
        String firstArr = In.nextLine();
        String[] fArr = firstArr.split(" ");

        System.out.print("Введите второй массив");
        String secondArr = In.nextLine();
        String[] sArr = secondArr.split(" ");
        int counter = 0;

        /**
         * Проверяем какой массив больше. Если больше второй массив то повторяем цикл пока i < (длины второго) цмкла,
         * иначе повторяем цикл i < (длины первого массива) раз
         */

        if (sArr.length >= fArr.length) {
            for (int i = 0; i < sArr.length; i++) {
                if (fArr[i].equals(sArr[i]) && i < fArr.length -1) {
                    counter++;
                } else {
                    counter++;
                    System.out.print("Массивы начинают различаться на индексе " + counter);
                    return;
                }

            }
        }
        else {
            for (int i = 0; i < fArr.length; i++) {
                if (sArr[i].equals(fArr[i]) && i < sArr.length -1) {
                    counter++;

                } else {
                    counter ++;
                    System.out.print("Массивы начинают различаться на индексе " + counter);
                    return;
                }

            }
        }
    }
}
