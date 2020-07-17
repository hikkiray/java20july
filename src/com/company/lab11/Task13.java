package com.company.lab11;
import  java.util.Scanner;
public class Task13 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        String words = In.nextLine();
        String [] result = words.split(",");
        System.out.print(result.length);
    }
}
