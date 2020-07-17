package com.company.lab9;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args){
        System.out.print("Введите целые числа разделенные ; :");
        Scanner In = new Scanner(System.in);
        String data = In.nextLine();
        if(data.isEmpty()){
            System.out.print("Исходная строка пуста");
            return;
        }
        String[] arr = data.split(";");
        int [] num = new int[arr.length];
        for(int i =0; i < arr.length; i++){
            num[i] = Integer.parseInt(arr[i]);
        }


        for(int i = 0; i < num.length -1 ; i++) {
            if (num[i] >= num[i + 1]) {
                System.out.print("Нарушена последовательность");
                return;
            }
        }
        for (int i = 1; i < num.length -1 ; i++){
            if (num[i] + 1 != num[i+1]){
                for (int j = 0; j <= (num[i+1] -num[i]) -1;j++){
                    if(num[i] + j != num[i] && num[i]+j != num[i+1]) {
                        System.out.print(num[i] + j);
                    }
                }
            }

        }


    }


}
