package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.print(arr[1]);
    }
}
