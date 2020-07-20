package com.company.lab11;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner In = new Scanner(System.in);
        System.out.print("Введите строку :");
        String data = In.nextLine();
        data = data.toUpperCase();
        data = data.replaceAll(" ","");
        File file = new File(".//resource/files/task4996/morze.txt");
        char[] str = data.toCharArray();
        String line = null;

        for (int i = 0; i < str.length; i++) {
            boolean x = true;
            Scanner s = new Scanner(file);
            if (s.hasNext()){
                for (int j = 0; j < 43; j++) {
                    line = s.nextLine();
                    char first = line.charAt(0);
                    if (str[i] == first){
                        line= line.substring(1);
                        System.out.print(line.trim()+" ");
                         x = false;
                        s.close();
                        break;
                    }
                }
                 if (x){
                    System.out.print("..--..");
                }

            }
        }
    }
}

//-.. --- -... .-. -.-- .--- -.. . -. ..-..
//-.. --- -... .-. -.-- .--- -.. . -. --.--
//Добрый день ошибка в задании "ь"

//-. .- -. .- ... . -.. . - ..--....--....--....--....--....--....--....--....--....--....--....--....--....--....--....--..
//-. .- -. .- ... . -.. . - ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--..