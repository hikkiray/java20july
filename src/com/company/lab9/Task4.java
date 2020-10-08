package com.company.lab9;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите данные:");
        Scanner In = new Scanner(System.in);
        String data = In.nextLine();
        String[] arr = data.split(",");
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 0; i < num.length ; i++) {
            if ( num[i] > num[i+1] ){
                int fickle = num[i+1];
                num[i+1] = num[i];
                num[i] = fickle;

            }
            if(num[i] < 19 && num[i+1] > 19){
                System.out.println("От " + num[i]+ " до " + num[i+1]+ "<---");
                break;
            }
            System.out.println("От " + num[i]+ " до " + num[i+1]);
            i++;
        }
    }
}
