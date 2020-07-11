package com.company.lab8;
import java.util.Scanner;
public class Task18 {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        String data = In.nextLine();

        String[] arr = data.split(";");
        boolean x = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("x")){
                System.out.print("Символ 'x' найден на позиции " + i);
                x = false;
            }

        }
        if (x){
            System.out.print("Символ 'x' отсутствует");
        }
    }
}
