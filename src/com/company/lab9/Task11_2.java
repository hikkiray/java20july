package com.company.lab9;
import java.util.Scanner;
public class Task11_2 {
    public static void main(String[] args){
        System.out.print("Введите целые числа разделенные ; :");
        Scanner In = new Scanner(System.in);
        String data = In.nextLine();
        if(data.isEmpty()){
            System.out.print("Исходная строка пуста");
            return;
        }
        String[] arr = data.split(";");
        int [] num = new int[arr.length];
        for(int i =0; i < arr.length; i++){
            num[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 0; i <arr.length-1 ; i++) {

        }
    }
}
