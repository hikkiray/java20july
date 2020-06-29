package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("vvedite danye");
        Scanner In = new Scanner(System.in);
        String data = In.nextLine();
        int m = In.nextInt();
        if(data.isEmpty()){
            System.out.print("");
            return;
        }
        String[] arr = data.split(" ");
        int [] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            num[i] = Integer.parseInt(arr[i]);
        }
        for (int i =0; i < num.length; i++){

            num[i] = num[i]* m;
        }
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i]);
            System.out.print(" ");
        }
    }
}
