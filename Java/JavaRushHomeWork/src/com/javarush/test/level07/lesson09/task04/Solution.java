package com.javarush.test.level07.lesson09.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {
        //напишите тут ваш код
        Iterator<String> iterator = list.iterator();

        for(int i = list.size(), c = 0; c < i;  c++){
            char[] arr = list.get(c).toCharArray();
            int count = 0, count1 = 0;
            for (char s : arr){
                if(s =='р')count++;
                if(s =='л')count1++;

            }
            if(count > 0 && count1 == 0) {list.remove(c); c--;}
            i = list.size();
        }

        for(int i = list.size(), c = 0; c < i;  c++){
            char[] arr = list.get(c).toCharArray();
            int count = 0, count1 = 0;
            for (char s : arr){
                if(s =='р')count++;
                if(s =='л')count1++;

            }
            if(count == 0 && count1 > 0) {list.add(c, list.get(c)); c++;}
            i = list.size();
        }


        return list;
    }
}