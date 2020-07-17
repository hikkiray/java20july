package com.company.lab11;
<<<<<<< HEAD

=======
>>>>>>> origin/master
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        String data = "abcdacadbacdaabaadc";
<<<<<<< HEAD
        System.out.println("ВВедите два симола :");
        String fragmet = In.nextLine();
        if (fragmet.length() != 2){
            System.out.println("Вводимая строка должна содержать ровно 2 символа");
            return;
        }
        data = data.replaceAll(fragmet, " ");
        System.out.println(data);
=======
        System.out.print("Введите 2 символа");
        String fragment = In.nextLine();
        int r = 0;
        for (int i = 0; i < data.length() && r > -1; i++) {
            System.out.print(r + " ");
            r = data.indexOf(fragment, r+1);

        }
>>>>>>> origin/master
    }
}
