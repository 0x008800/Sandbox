package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        ArrayList<int[]> c = new ArrayList<int[]>();
        int[] arr = {4, 5, 6, 7, 8};
        int[] arr1 = {4, 5};
        int[] arr2 = {4, 5, 6, 7};
        int[] arr3 = {4, 5, 6, 7, 8, 4, 5};
        int[] arr4 = new int[0];
        c.add(arr);
        c.add(arr1);
        c.add(arr2);
        c.add(arr3);
        c.add(arr4);
        return c;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
