package com.company.lab9;
import java.util.Scanner;
public class Task13 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        int arr [][] = new int[10][10];
        System.out.println();
        System.out.println("                abcdefghij");
        for (int i = 0; i <10 ; i++) {
            System.out.println("               "+i +"         |");
        }
        System.out.println("               __________|");

        System.out.println("Укажите координаты вашего 4-х палубного корабля :");
        System.out.println("OX :");
        int Ox = In.nextInt();
        System.out.println("OY :");
        int Oy = In.nextInt();
        System.out.println("Выберете направление :");
        System.out.println("1. Вертикальное ");
        System.out.println("2. Горизонатльное ");
        int rotation = In.nextInt();
        System.out.println();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length; j++) {

            }
        }
    }
}
