package com.company.lab5;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args){
        /**
         * Считывание данных пользователя
         */
        System.out.print("Введите Xa :");
        Scanner In = new Scanner(System.in);
        int Xa = In.nextInt();
        System.out.print("Введите Xb :");
        int Xb = In.nextInt();
        System.out.print("Введите Ya :");
        int Ya = In.nextInt();
        System.out.print("Введите Yb :");
        int Yb = In.nextInt();

        double delx = Xb - Xa; //delata x
        double dely = Yb - Ya; //delat y
        int quater = 1;
        double angle = 0;
        double r = Math.atan(dely/delx); // Находим arctg  =r
        r = Math.toDegrees(r);

        double horizontal = delx*delx + dely*dely; // Определяем горизонатльное положение
        if (delx >= 0 && dely > 0){
            angle = r;
            System.out.println("\n"+ " Четверть :" +quater+ "\n"+" Дирекционный угол :" +angle +"\n"+" Горизонтальное проложение :" +Math.sqrt(horizontal));
        }else if (delx < 0 && dely >= 0){
            angle = 180 - r;
            quater = 2;
            System.out.println("\n"+ " Четверть :" +quater+ "\n"+" Дирекционный угол :" +Math.toDegrees(angle)+"\n"+" Горизонтальное проложение :" +Math.sqrt(horizontal));
        }else if (delx <= 0 && dely < 0){
            quater =3;
            angle = 180 +r;
            System.out.println("\n"+ " Четверть :" +quater+ "\n"+" Дирекционный угол :" +Math.toDegrees(angle)+"\n"+" Горизонтальное проложение :" +Math.sqrt(horizontal));
        }else if (delx > 0 && dely <=0){
            quater =4;
            angle = 360 - r;
            System.out.println("\n"+ " Четверть :" +quater+ "\n"+" Дирекционный угол :" +Math.toDegrees(angle)+"\n"+" Горизонтальное проложение :" +Math.sqrt(horizontal));
        }
    }
}
