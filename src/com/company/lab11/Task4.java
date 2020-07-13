package com.company.lab11;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        String data = "abcabcabbacbacbaaac";
        String fragment = In.nextLine();
        int r = 0;
        if (fragment.length()>2){
            System.out.println("Вводимая строка должна содержать ровно 2 символа");
            return;
        }
        for (int i = 0; i < data.length() && r > -1; i++) {
            System.out.print(r + " ");
            r = data.indexOf(fragment, r+1);

        }
    }
}
