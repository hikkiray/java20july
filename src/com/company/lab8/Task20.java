package com.company.lab8;
import java.util.Scanner;
public class Task20 {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.print("Введите первый массив");
        String firstArr = In.nextLine();
        String[] fArr = firstArr.split(" ");

        System.out.print("Введите второй массив");
        String secondArr = In.nextLine();
        String[] sArr = secondArr.split(" ");

        /**
         * Проверяем какой массив больше. Если больше второй массив то повторяем цикл пока i < (длины второго) цмкла,
         * иначе повторяем цикл i < (длины первого массива) раз
         */

        if (fArr.length >= sArr.length) {
            for (int i = 0; i < sArr.length; i++) {
                if (!fArr[i].equals(sArr[i])) {
                    System.out.println("Элементы не совпадают на индексе :" + i);
                    return;
                }
            }
        } else {
            for (int i = 0; i < fArr.length; i++) {
                if (!sArr[i].equals(fArr[i])) {
                    System.out.println("Элементы не совпадают на индексе :" + i);
                    return;
                }
            }


        }

    }
}