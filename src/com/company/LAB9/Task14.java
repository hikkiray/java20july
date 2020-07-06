package com.company.LAB9;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args){
        System.out.print("Введите 13 цифр штрихкода ");
        Scanner In = new Scanner(System.in);
        String data = In.nextLine();
        if (data.isEmpty()){  //Проверка на наличие символов
            System.out.print("Исходная строка пуста");
            return;
        }

        String[] arr = data.split(" ");
        if (arr.length > 13){
            System.out.print("Error");
        }
        int [] num = new int[arr.length];
        for(int i=0; i < arr.length; i++){
            num[i] = Integer.parseInt(arr[i]);
        }


        int product =0;
        int sum = 0;
        int lastDigit = 0;
        int nearest10 = 0;
        int result = 0;

        for (int i = 0; i < arr.length -1; i++) {
            int ves = 3;
            if (i % 2 == 0) {
                ves = 1;
            }
            product = num[i] * ves;

            sum = sum + product;
            System.out.print("Цифра " + num[i] + "Имеет сумму" + sum);
            System.out.println();

        }
        if (sum % 10 != 0){
            lastDigit = sum % 10;
            int x = 10 - lastDigit;

            if (lastDigit <=5){
                nearest10 = sum - x;
                result = sum - nearest10;
            }
            else {

                nearest10 = sum + x;
                result = nearest10 - sum;
            }
        }
        if (num[12] == result){
            System.out.print("Контрольная сумма "+  result + " совпадает с последней цифрой " + num[12]);
        }
        else
            System.out.print("Контрольная сумма "+  result + " не совпадает с последней цифрой " + num[12]);
    }
}
