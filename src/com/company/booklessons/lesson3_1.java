package com.company.booklessons;

import java.util.Scanner;

public class lesson3_1 {
    public static void main (String[] args){
        System.out.println("Справка :");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("Выберите :");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        switch (choice){
            case 1:
                System.out.println("Оператор if : \n");
                System.out.println("if (условие) оператор;");
                System.out.println("else оператор");
                break;
            case 2:
                System.out.println("Оператор switch \n");
                System.out.println("switch (выражение) {");
                System.out.println("case константа");
        }
    }
}
