package com.company.lab11;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        String data ="abcdefwxyz";
        System.out.println("Введите СА");
        int ca = In.nextInt();
        System.out.println("Введите СВ");
        int cb = In.nextInt();
        if (ca <0){
            System.out.print("Значение CA должно быть в интервале [0, длина строки)");
            return;
        }
        if (ca + cb >10){
            System.out.print("Сумма значений CA и CB должна быть меньше длины строки");
            return;
        }
        if (cb<0){
            System.out.print("Значение CB должно быть неотрицательно");
            return;
        }
       String x = data.substring(0, ca);
        String y = data.substring(ca+cb, data.length());
        System.out.print(x + y);
    }
}
