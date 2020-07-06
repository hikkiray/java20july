package com.company.LAB9;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args){
        System.out.print("Введите целые числа разделенные символом ;  :");
        Scanner In = new Scanner(System.in);
        String data = In.nextLine();
        if (data.isEmpty()){
            System.out.print("Исходная строка пуста");
            return;
        }
        String[] arr = data.split(";");
        int[] num = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            num[i] = Integer.parseInt(arr[i]);
        }
        int temp = 1;
        boolean isSort = true;
        for (int i = 1; i < arr.length && isSort; i++){

            if(num[i] >= num[i-1]){
                temp +=1;
            }

            else {
                System.out.print("Элемент со значением " + num[i] + " на индексе " + temp + " нарушает закономерность");
                isSort = false;
                //return;
            }

        }
        if (isSort)
        System.out.print("Значения отсортированы по возрастанию");



    }
}
