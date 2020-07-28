package com.company.lab13;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) throws IOException {
        File file = new File("rectangle.html");
        PrintWriter print = new PrintWriter(file);
        Scanner In = new Scanner(System.in);
        System.out.println("Введите параметры первого прямоугольника ");
        System.out.print("X : ");
        int x1 = In.nextInt();
        System.out.print("Y : ");
        int y1 = In.nextInt();
        System.out.print("Width : ");
        int w1 = In.nextInt();
        System.out.print("Height : ");
        int h1 = In.nextInt();

        System.out.println("Введите параметры второго прямоугольника ");
        System.out.print("X : ");
        int x2 = In.nextInt();
        System.out.print("Y : ");
        int y2 = In.nextInt();
        System.out.print("Width : ");
        int w2 = In.nextInt();
        System.out.print("Height : ");
        int h2 = In.nextInt();
        /**
         * Условие пересечения двух прямоугольников
         * (x2 > x1 - w2) && (x2 < x1+w1) && (y2 > y1-h2) && (y2 < y1+h1)
         */

        int x3 ,y3,h3,w3;
        //Находим Y и Height пересечения
        if (y2 > y1){
            h3 = h1 - (y2-y1);
            y3 = (y2 - y1) + y1;
        }else {
            h3 = h2 - (y1-y2);
            y3 = (y1 - y2) + y2;
        }
        //Находим X и Width пересечения
        if (x2 > x1){
             w3 = w1 - (x2 - x1);
             x3 = (x2 - x1) + x1;
        }else {
             w3 = w2 - (x1 - x2);
             x3 = (x1 - x2) + x2;
        }
        //Проверяем случай, когда один прямоугольник вложен в другой
        if (w1 > w2 && h1 > h2 ){
            h3 = h2;
            w3 = w2;
        }else if (w2 > w1 && h2 > h1){
            h3 = h1;
            w3 = w1;
        }
        //Проверяем случай,
        if (w1 < w2 && x1 > x2)
            w3 = w1;
        if (w2 < w1 && x2 > x1)
            w3 = w2;

        if (h1 < h2 && y1 > y2)
            h3 = h1;
        if (h2 < h1 && y2 > y1)
            h3 = h2;
        //Тестовый вывод
        if ((x2 > x1 - w2) && (x2 < x1+w1) && (y2 > y1-h2) && (y2 < y1+h1)){
            System.out.println("Прямоугольники пересекаются");
            System.out.println(h3);
            System.out.println(w3);
        }


        print.println("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta charset=\"utf-8\"/>\n" +
                "<head/>\n" +
                "<body>\n" +
                "<h1>Мой первый векторный рисунок</h1>\n" +
                "\n" +
                "<svg width=\"1920\" height=\"1080\">\n" +
                "\t<rect x = \""+x1+"\" y = \""+y1+"\" width = \""+w1+"\" height = \""+h1+"\" fill = \"blue\"/>\n" +
                "\t<rect x = \""+x2+"\" y = \""+y2+"\" width = \""+w2+"\" height = \""+h2+"\" fill = \"red\"/>\n" +
                "\t<rect x = \""+x3+"\" y = \""+y3+"\" width = \""+w3+"\" height = \""+h3+"\" fill = \"yellow\"/>\n" +
                "</svg>\n" +
                "</body>\n" +
                "</html>");
        print.close();
        Desktop.getDesktop().open(file);
    }
}
