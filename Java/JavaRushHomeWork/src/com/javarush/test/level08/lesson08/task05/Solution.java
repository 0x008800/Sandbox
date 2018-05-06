package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;
import  java.lang.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> im = createMap();
        removeTheFirstNameDuplicates(im);


    }
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Крячко", "Сергей");
        map.put("Шумейко", "Ольга");
        map.put("Ендовицкий", "Максим");
        map.put("Дякун2", "Людмила");
        map.put("Дякун1", "Александр");
        map.put("Дякун", "Ольга");
        map.put("Табаков", "Александр");
        map.put("Ярмантович", "Станислав");
        map.put("Скочеляс", "Ольга");
        map.put("Хомышин", "Антон");//Напишите тут ваш код

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //Копируем переданную мапу 2 раза
        HashMap<String, String> map2 = new HashMap<String, String>(map);


        //цикл по map2
        for (Map.Entry<String, String> pair : map2.entrySet())
        {

            for(Map.Entry<String, String> pair2 : map2.entrySet()){
                if( pair.getValue().equals(pair2.getValue()) && !pair.getKey().equals(pair2.getKey()))
                    removeItemFromMapByValue(map, pair.getValue());
            }

        }
        for(Map.Entry<String, String> pair : map.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }
    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());

        }
    }
}
