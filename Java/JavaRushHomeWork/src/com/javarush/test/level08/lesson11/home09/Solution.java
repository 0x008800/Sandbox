package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static boolean isDateOdd(String date)
    {
        Date newYear = new Date();
        newYear.setMonth(0); //устанавливаем месяц 0
        newYear.setDate(1); //устанавливаем день


        Date nowDate = new Date(date); //получаем переданную дату
        newYear.setYear(nowDate.getYear()); //устанавливаем день
        //получаем валовое количество миллисекунд
        long timeDistance = nowDate.getTime()-newYear.getTime();

        long msDay = 24*60*60*1000;  //количество миллисекунд в одном дне

        //делим валовое количество миллисекунд на миллисекунды в дне
        int dayCount = (int)(timeDistance/msDay); //получаем кол-во дней

        if (dayCount%2 != 0) return true;
        else return false;
    }
}
