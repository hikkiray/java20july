package com.company.lab11;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        String data = In.nextLine();
        char z = data.charAt(0);
        if (z == 's'){
            data = data.toLowerCase();

        }else if (z == 'U'){
            data = data.toUpperCase();
        }
        System.out.println(data);
    }
}
