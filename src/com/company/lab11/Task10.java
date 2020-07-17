package com.company.lab11;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        String data = "abcdacadbacdaabaadc";
        System.out.print("Введите 2 символа");
        String fragment = In.nextLine();
        int r = 0;
        for (int i = 0; i < data.length() && r > -1; i++) {
            System.out.print(r + " ");
            r = data.indexOf(fragment, r+1);

        }
    }
}
