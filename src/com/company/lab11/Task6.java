package com.company.lab11;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        String data = "abcdefwxyz";
        System.out.println("Введите первый символ :");
        String x = In.nextLine();
        System.out.println("Введите первый символ :");
        String y = In.nextLine();
        int findex = data.indexOf(x);
        int sindex = data.indexOf(y);

        /**
         * Проверка на наличие символа в исходной строке
         */
        if (findex ==-1){
            System.out.println("Значение CA отсутствует в строке");
        }
        if (sindex ==-1){
            System.out.println("Значение CB отсутствует в строке");
        }

        /**
         * Проверка, что бы понять какой индекс больше
         */

        if (findex < sindex){
            for (int i = findex+1; i < sindex; i++) {
                System.out.print(data.charAt(i));
            }
        }else {
            for (int i = sindex+1; i < findex; i++) {
                System.out.print(data.charAt(i));
            }
        }
    }
}
