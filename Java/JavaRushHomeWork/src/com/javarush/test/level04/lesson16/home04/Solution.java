package com.javarush.test.level04.lesson16.home04;

import java.io.*;
import java.util.Scanner;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        System.out.print("Меня зовут " + name + "\n" + "Я родился " + day + "." + month + "." + year);
    }
}