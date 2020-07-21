package com.company.lab11;
import  java.util.Scanner;
public class Task15 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        System.out.print("Введите строку :");
        String data = In.nextLine();
        char[] ch = data.toCharArray();
        int counter = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '"' && counter %2 ==0){
                System.out.print("[");
                counter++;
            }else if (ch[i] == '"' && counter%2 == 1){
                System.out.print("]");
                counter++;
            }
            if (ch[i] != '"')
            System.out.print(ch[i]);
        }
    }
}
