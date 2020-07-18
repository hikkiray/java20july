package com.company.lab11;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        String data = "abcdacadbacdaabaadc";
        System.out.println("Введите два символа :");
        String fragment = In.nextLine();
        if (fragment.length() != 2){
            System.out.println("Вводимая строка должна содержать ровно 2 символа");
        }
        data = data.replaceAll(fragment, " ");
        System.out.println(data);
    }
}
