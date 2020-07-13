package com.company.lab11;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        System.out.print("Введите первое число");
        int x = In.nextInt();
        System.out.print("Введите второе число");
        int y = In.nextInt();
        String data= "abcdefwxyz";
        if (x >=0 && y<= data.length()){
            if (x > y) {
                int z = x;
                x = y;
                y = z;
            }
            String arr= data.substring(x , y+1);
            System.out.print(arr);
        }else {

        }
    }
}
