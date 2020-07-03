package com.company.lab10;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args){

        System.out.print("Введите целые чился разделенные символом 'пробел' ");
        Scanner In = new Scanner(System.in);
        String data = In.nextLine();
        if (data.isEmpty()){  //Проверка на наличие символов
            System.out.print("Исходная строка пуста");
            return;
        }

        String[] arr = data.split(" ");
        int [] array = new int[arr.length];
        for(int i=0; i < array.length; i++){
            array[i] = Integer.parseInt(arr[i]);
        }

        //int [] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};

        System.out.println("Не отсоритрванный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        for (int i = 0; i < array.length; i++) {

            int minIndex = min(array, i, array.length);

            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
        System.out.println();
        System.out.println("Отсоритрванный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

    private static int min(int[] array, int start, int end) {
        int minIndex = start;
        int minValue = array[start];
        for (int i = start + 1; i < end; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    }

