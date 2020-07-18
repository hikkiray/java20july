package com.company.lab12;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        int sum =0;
        int x = 0;
        while (sum < 1000){
            int num = In.nextInt();
            sum = sum+num;
            x++;
        }
        System.out.println(x);
    }
}
