package com.company.lab10;
import java.util.Scanner;
public class Task14 {
    public static void main(String[] args){
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
        System.out.print("Исходный массив");
        for (String s : arr) {
            System.out.print(" " + s);

        }
        System.out.println();

        boolean isSort = false;
        int min = num[0];
        while (!isSort){
            isSort = true;
            for(int i = 1; i < arr.length; i++){
                if (num[i] < min){
                    min = num[i];
                    isSort = false;
                }
            }
        }
        System.out.print("Минимальный элемент это : "+ min);

    }

}
