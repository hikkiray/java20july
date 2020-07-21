package com.company.lab13;

import java.util.Random;

public class Task6 {
    public static void main(String[] args){
        Random rnd = new Random();

        for (int i = 0; i < 100; i++) {
            System.out.print(100 + rnd.nextInt(899));
            System.out.print(" ");
        }
    }
}
