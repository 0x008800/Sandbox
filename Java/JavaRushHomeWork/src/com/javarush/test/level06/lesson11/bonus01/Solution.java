package com.javarush.test.level06.lesson11.bonus01;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде «Max is 25»
*/
import java.io.*;

public class Solution
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        String max1 = "Max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int max = a > b ? a : b;

        System.out.println(max1 + max);
    }

}
