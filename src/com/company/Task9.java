package com.company;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args){
        System.out.print("Введите целые чился разделенные символом ");
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

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length; i++) {
                if (num[i] < num[i - 1]) {
                    int temp = num[i];
                    num[i] = num[i - 1];
                    num[i - 1] = temp;
                    isSorted = false;
                }
            }
            System.out.println(arr);
        }

    }
}
