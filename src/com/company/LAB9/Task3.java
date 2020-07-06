package com.company.LAB9;
import javax.swing.plaf.synth.SynthScrollBarUI;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        System.out.print("Размер первого массива:");
        int x = In.nextInt();
        int y;
        int [] left = new int[x];
        for(int i = 0; i < x; i++){
            y = In.nextInt();
            left [i] = y;
        }
        System.out.print("Размер второго массива:");
        int z = In.nextInt();
        if( z != x){
            System.out.print("Размеры массивов должны быть одинаковы");
        }
        int c;
        int[] right = new int[z];
        for(int i = 0; i < z; i++){
            c = In.nextInt();
            right [i] = c;
        }
        int n =0;
        for(int i=0; i< x; i++) {
             n = left[i] * right[i];
             System.out.print(n + " ");
        }
        System.out.print(n);




    }

}
