package com.company.lab12;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        int a = 1;
        int sum =0;
        int counter = 0;
        while (a != 0){
            a = In.nextInt();
            sum = sum +a;
            counter++;
        }
        System.out.println(sum );
        System.out.println(counter );
    }
}
