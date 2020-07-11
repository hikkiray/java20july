package com.company.lab10;
import java.util.Scanner;
public class Task18 {
    public static void main(String[] args){
        System.out.println("Введите целые числа разделенные пробелами :");
        Scanner In = new Scanner(System.in);
        String data = In.nextLine();
        if(data.isEmpty()){
            System.out.println("Исходная строка пустая");
            return;
        }
        String [] arr = data.split(" ");
        int [] num = new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }

        boolean isSort = true;
        while (isSort){
            isSort = false;
            for (int i = 1; i < num.length ; i++) {
                if (num[i] < num[i-1]){
                    int temp = num[i-1];
                    num [i-1] = num[i];
                    num[i] = temp;
                    isSort = true;
                }
            }
        }

        int avg = num.length / 2;
        if (num.length %2 == 1){
            System.out.println("Медиана :"+num[avg]);
        }else {
            int result = num[avg] + num[avg-1];
            System.out.println("Медиана :"+ result/2);
        }
    }
}
