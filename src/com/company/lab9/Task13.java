package com.company.lab9;
import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {

        /**
         * Сделать два массива с буквами и цифрами
         * Переделать массив с буквами в массив с индексами
         * Создать цикл в котором мы присваевам 1 в элементы по X Y, где Y это цифры а X индексы букв
         * Пройтись по строкам массива и заменить 0 на пробел а 1 на #
         */
        System.out.print("Введите координаты :");
        Scanner In = new Scanner(System.in);
        String data = In.nextLine();
        if(data.isEmpty()){
            System.out.print("Исходная строка пуста");
            return;
        }
        /**
         * Записываем числа в OY
         */
        String[] arr = data.split(";");
        int [] OY = new int[arr.length];
        for(int i =1; i < arr.length; i +=2){
            OY[i] = Integer.parseInt(arr[i]);
        }
        String[] OX = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            OX[i] = String.
        }

    }
}
