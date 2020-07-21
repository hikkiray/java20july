package com.company.lab13;

import java.util.Random;

public class Task7 {
    public static void main(String[] args){
        Random rnd = new Random();
        int [] mas = new int[10];
       int a =  mas[0] = rnd.nextInt(30);
        for (int i = 0; i < 10; i++) {
            mas[i] = rnd.nextInt(30);
            boolean x = true;
            for (int j = 0; j < mas.length; j++) {
                if (mas[i]== mas[j] && mas[i]!= mas[i]){
                    x = false;
                }

            }
            if (x)
                System.out.print(mas[i] + " ");
        }

    }


}
//Каждый новый элемент записывать в отдельную переменную, сравнивать данный элемент со всеми остальными.
