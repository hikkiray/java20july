package com.company.lab11;

import java.util.Scanner;
public class Task10 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        String data = "abcdacadbacdaabaadc";
        System.out.println("ВВедите два симола :");
        String fragmet = In.nextLine();
        if (fragmet.length() != 2){
            System.out.println("Вводимая строка должна содержать ровно 2 символа");
            return;
        }
        data = data.replaceAll(fragmet, " ");
        System.out.println(data);
    }
}
