package com.company.lab12;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Task19 {
    public static void main(String[] args)throws FileNotFoundException{
        System.out.println("Введите номер файла :");
        int i = 0;
        int value = 0;
        int fvalue= 0;
        while (i <= 10){
            File file = new File("./resource/files/task9417/data"+i+".txt");
            fvalue =0;
            if (!file.exists()){
                System.out.println("ОШИБКА: Файл не найден");
            }else {
                Scanner s = new Scanner(file);

                while (s.hasNext()){
                    int num = s.nextInt();
                    fvalue += num;
                }

                System.out.println(fvalue);

                s.close();

            }
            i++;


        }



    }
}
