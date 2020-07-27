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
                "</svg>\n" +
                "</body>\n" +
                "</html>");
        print.close();
        Desktop.getDesktop().open(file);
    }
}
