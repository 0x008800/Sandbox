package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        char[] glass = new char[100];
        char[] soglass = new char[100];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stroka = reader.readLine();
        char[] str = stroka.toCharArray();
        int countG = 0, countS = 0;
        for(int i = 0; i< str.length; i++){

            if (isVowel(str[i])) {
                glass[countG] = str[i];
                countG++;
            }
            else {
                soglass[countS] = str[i];
                countS++;
            }
        }
        String gl = "";
        for(int i=0; i < glass.length; i++){
            if(glass[i] == '\u0000') continue;
            gl += glass[i] + " ";
        }
        System.out.println(gl);

        String sogl = "";
        for(int i=0; i < soglass.length; i++){
            if(soglass[i] == '\u0000' || soglass[i] == ' ') continue;
            sogl += soglass[i] + " ";
        }
        System.out.println(sogl);
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
