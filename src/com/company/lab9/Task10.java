package com.company.lab9;
import java.util.Scanner;
class Task10 {
    public static void main(String[] args){
        System.out.print("Введите целые чился разделенные символом 'пробел' ");
        Scanner In = new Scanner(System.in);
        String data = In.nextLine();
        if (data.isEmpty()){  //Проверка на наличие символов
            System.out.print("Исходная строка пуста");
            return;
        }
        String[] arr = data.split(" ");
        int [] num = new int[arr.length];
        for(int i=0; i < arr.length; i++){
            num[i] = Integer.parseInt(arr[i]);
        }
        System.out.print("Исходный массив");
        for(int i = 0; i < arr.length; i++ ){
            System.out.print(" "+ arr[i]);

        }
        System.out.println();

        boolean isSort = false;
        while (!isSort) {
            isSort = true;
            for (int i = 1; i < arr.length; i++) {
                if (num[i] < num[i - 1]) {
                    int temp = num[i];
                    num[i] = num[i - 1];
                    num[i - 1] = temp;
                    isSort = false;
                }
            }
            System.out.println();
            System.out.print("Отсоритрванный массив:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(" " + num[i]);
            }
        }
    }
}
