package com.javarush.test.level07.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
       for(int i = 0; i < 10; i++){
           arr[i] = Integer.parseInt(reader.readLine());
       }

       /* for(int i = 0; i < 10; i++){
            int name = arr[i];
            int pok = i;
            for(int c = i +1; c <10; c++){
                if(arr[c] < name){
                    name = arr[c];
                    pok = c;
                }
            }
            if(i != pok){
                int temp = arr[i];
                arr[i] = name;
                arr[pok] = temp;
            }
        }*/
        for (int i = 9; i >= 0; i--)
            System.out.println(arr[i]);
    }
}
