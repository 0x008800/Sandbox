package com.javarush.test.level08.lesson08.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("family","name");
        map.put("family1","name1");
        map.put("family2","name2");
        map.put("family3","name3");
        map.put("family4","name4");
        map.put("family5","name5");
        map.put("family6","name6");
        map.put("family7","name7");
        map.put("family8","name8");
        map.put("family9","name9");

        return  map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int count = 0;
        for(Map.Entry<String, String> pair : map.entrySet())
            if(name.equals(pair.getValue())) count++;
        return  count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //напишите тут ваш код
        int count = 0;
        for(Map.Entry<String, String> pair : map.entrySet())
            if(familiya.equals(pair.getKey())) count++;
        return  count;
    }
}
