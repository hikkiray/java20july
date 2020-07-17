package com.company.lab12;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Введите номер файла :");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        File file = new File("./resource/files/task6175/test"+num+".txt");
        if (!file.exists()){
            System.out.println("Файл не найден"+ file.getAbsolutePath());
            return;
        }
        Scanner In = new Scanner(file);
        String str;

        if (!In.hasNext()){
            System.out.println("Файл пуст");
        }
        while (In.hasNext()){

            str = In.nextLine();
            System.out.print("####");
            System.out.print(str);
        }
    }
}
