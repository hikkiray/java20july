package com.company.lab12;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Task21 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Введите номер файла :");
        Scanner In = new Scanner(System.in);
        int num = In.nextInt();
        File file = new File("./resource/files/task2137/test"+num+".txt");
        if (!file.exists()){
            System.out.println("Файл не найден"+ file.getAbsolutePath());
            return;
        }

        Scanner s = new Scanner(file);
        System.out.print("Введите символ :");
        String b = In.next();
        char fragment = b.charAt(b.length()-1);
        String str ;
        int counter = 0;

        if (!In.hasNext()){
            System.out.println("Файл пуст");
        }

        while (s.hasNext()){
            str = s.nextLine();
            char [] ch = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                if (ch[i] == fragment){
                    counter++;
                }
            }
            System.out.print(counter);
            counter = 0;
            }

        }
//        s.close();
//        System.out.print(counter);

    }

