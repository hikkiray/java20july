package com.company.lab8;
import java.util.Scanner;
public class Task21 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        System.out.println("Введите левый массив");
        String leftArr = In.nextLine();
        String[] lArr = leftArr.split(" ");
        System.out.println("Введите левый массив");
        String rightArr = In.nextLine();
        String[] rArr = rightArr.split(" ");
        for (int i = 0; i < lArr.length; i++) {
            if (lArr[i].equals(rArr[i])){
                break;
            }
        }

    }

}
