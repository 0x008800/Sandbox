package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код

        String name1 = "cat1";
        String name2 = "cat2";
        String name3 = "cat3";
        String name4 = "cat4";
        String name5 = "cat5";
        String name6 = "cat6";
        String name7 = "cat7";
        String name8 = "cat8";
        String name9 = "cat9";
        String name10 = "cat10";
        Cat cat1 = new Cat(name1);
        Cat cat2 = new Cat(name2);
        Cat cat3 = new Cat(name3);
        Cat cat4 = new Cat(name4);
        Cat cat5 = new Cat(name5);
        Cat cat6 = new Cat(name6);
        Cat cat7 = new Cat(name7);
        Cat cat8 = new Cat(name8);
        Cat cat9 = new Cat(name9);
        Cat cat10 = new Cat(name10);
        Map<String, Cat> cats = new HashMap<String, Cat>();
        cats.put(name1, cat1);
        cats.put(name2, cat2);
        cats.put(name3, cat3);
        cats.put(name4, cat4);
        cats.put(name5, cat5);
        cats.put(name6, cat6);
        cats.put(name7, cat7);
        cats.put(name8, cat8);
        cats.put(name9, cat9);
        cats.put(name10, cat10);
        return  cats;

    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> catSet = new HashSet<Cat>();
        for(Map.Entry<String, Cat> pair : map.entrySet()){
            catSet.add(pair.getValue());
        }
        return  catSet;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
