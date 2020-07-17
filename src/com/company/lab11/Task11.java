package com.company.lab11;
import java.util.Scanner;
public class Task11 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        String fragment = In.nextLine();
        fragment =fragment.replaceAll(" ","");//Заменяем пробелы на пустоту
        String s = fragment.substring(1, fragment.length()-1);
        System.out.print(s);
    }
}
