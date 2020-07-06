package com.company.lab10;

import java.util.Scanner;

public class    Task10 {
    public  static void main(String[] args){
        System.out.print("Введите целые числа разделенные пробелом :");
        Scanner In = new Scanner(System.in);
        String data = In.nextLine();

        if(data.isEmpty()){
            System.out.print("Исходная строка пуста");
            return;
        }
        String[] arr = data.split(" ");
        int [] num = new int[arr.length];
        for(int i =0; i < arr.length; i++){
            num[i] = Integer.parseInt(arr[i]);
        }

        double average =0;
        if (arr.length>0){
            double sum  = 0;
            for (int i = 0; i < arr.length; i++){
                sum += num[i];
            }
            average = sum / arr.length;
        }
        for (int j=0; j < arr.length; j++){
            double a =num[j] - average;
             System.out.print(" " +a);
        }
    }
}
