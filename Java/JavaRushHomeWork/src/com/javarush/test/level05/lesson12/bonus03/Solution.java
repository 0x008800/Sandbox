package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;
import java.util.Arrays;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());
        int[] arr = new int[count];
        for(int i = 0; i < count; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(arr);
        int maximum = arr[count - 1];

        //напишите тут ваш код




        System.out.println(maximum);
    }
}
