package com.company.lab11;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        System.out.println("Введите первый символ :");
        String first = In.nextLine();
        System.out.println("Введите второй символ :");
        String second = In.nextLine();
        String data = "abcdefwxyz";
        int x = data.indexOf(first);
        int y = data.indexOf(second);
        int sum;
        if (x == -1){
            System.out.println(" Символ \t"+first+" \tотсутствует в исходной строке ");
            return;
        }
        if (y == -1){
            System.out.println(" Символ \t"+second+" \tотсутствует в исходной строке ");
            return;
        }

        if (x > y){
            sum = x - y;
        }else {
            sum = y - x;
        }
        sum -=1;
        System.out.println("Количество символов между введенными символами :" + sum);

    }
}
