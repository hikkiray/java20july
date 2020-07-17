package com.company.lab11;
import java.util.Scanner;
public class Task6_2 {
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

        if (findex < sindex){
            String result = data.substring(findex+1,sindex);
            System.out.print(result);
        }else {
            String result = data.substring(sindex+1,findex);
            System.out.print(result);
        }

    }
}
