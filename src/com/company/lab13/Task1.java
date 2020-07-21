package com.company.lab13;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) throws IOException {
        File file = new File("circle.html");
        PrintWriter print = new PrintWriter(file);
        Scanner In = new Scanner(System.in);
        int cy = In.nextInt();
        int cx = In.nextInt();
        int r = In.nextInt();
        int stroke_width = In.nextInt();

        if (stroke_width > r){
            System.out.println("Толщина обводки должна быть меньше диаметра круга");
            return;
        }
        if (cx < r && cy < r){
            System.out.println("Левая точка круга должна иметь неотрицательные координаты");
            return;
        }
        if (cx >= 600 || cy >= 800){
            System.out.println("Круг должен быть в пределах рисунка");
            return;
        }
        print.println("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta charset=\"utf-8\"/>\n" +
                "<head/>\n" +
                "<body>\n" +
                "<h1>Мой первый векторный рисунок</h1>\n" +
                "\n" +
                "<svg width=\"800\" height=\"600\">\n" +
                "\t<circle cx=\""+cx+"\" cy=\""+cy+"\" r=\""+r+"\" stroke=\"green\" stroke-width=\""+stroke_width+"\" fill=\"yellow\" />\n" +
                "</svg>\n" +
                "</body>\n" +
                "</html>");
        print.close();
        Desktop.getDesktop().open(file);
    }
}
