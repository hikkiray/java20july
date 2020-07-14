package com.company.lab11;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        String data = "abcdefwxyz";
        String fragment  = In.nextLine();

      int r = data.indexOf(fragment);
      if ( r == -1){
          System.out.print("Фрагмент" +fragment+" отсутствует в строке");
      }else {
          int arr = r + fragment.length();
          int result = 10 - arr;
          System.out.println("Фрагмент "+fragment+" находится на индексе" + r);
          System.out.println("Длина введенного фрагмента "+ fragment.length());
          System.out.println("После него есть еще "+result+" символов");

      }
    }
}
