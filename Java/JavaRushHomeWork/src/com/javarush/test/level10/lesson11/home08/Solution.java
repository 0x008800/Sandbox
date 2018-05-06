package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код
        ArrayList<String>[] c = new ArrayList[3];
        ArrayList<String> s1 = new ArrayList<String>();
        for(int i = 0; i < 10; i++){
            String temp = "am" + i;
            s1.add(temp);
        }
        ArrayList<String> s2 = new ArrayList<String>();
        for(int i = 0; i <10; i++){
            String temp = "a" + i;
            s2.add(temp);
        }
        ArrayList<String> s3 = new ArrayList<String>();
        for(int i = 0; i <10; i++){
            String temp = "m" + i;
            s3.add(temp);
        }
        c[0] = s1;
        c[1] = s2;
        c[2] = s3;



        return c;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}