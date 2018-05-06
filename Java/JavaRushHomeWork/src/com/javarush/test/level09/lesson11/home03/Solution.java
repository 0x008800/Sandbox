package com.javarush.test.level09.lesson11.home03;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* Метод в try..catch
Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа) этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода
*/

public class Solution
{
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        try{
        Scanner scanner = new Scanner(System.in);
            for(int i = 0; i < 5; i++) list.add(scanner.nextInt());
            }
        catch (Exception e){
            Iterator<Integer> iterator = list.iterator();

            while(iterator.hasNext()){
                int text = iterator.next();
                System.out.println(text);
            }
        }
    }
}
