package com.company.lab13;

import java.util.Random;

public class Task6 {
    public static void main(String[] args){
        Random rnd = new Random();
        int [] nusms = new int[100];
        for (int i = 0; i < 100; i++) {
            nusms[i] = (100+rnd.nextInt(899) );
        }
        for (int i = 0; i < nusms.length ; i++) {
            System.out.print(nusms[i]);
            System.out.print(" ");
        }
    }
}
