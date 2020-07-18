
package com.company.lab12;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("Введите номер файла :");
        Scanner In = new Scanner(System.in);
        int num = In.nextInt();
        File file = new File("./resource/files/task4642/test"+num+".txt");
        if (!file.exists()){
            System.out.println("Файл не найден"+ file.getAbsolutePath());
            return;
        }
        Scanner s = new Scanner(file);
        String str ;
        int counter = 0;

        if (!In.hasNext()){
            System.out.println("Файл пуст");
        }

        while (s.hasNext()){
            s.next();
            counter++;
        }

        s.close();
        System.out.print(counter);

    }
}