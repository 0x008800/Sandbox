package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/
import java.io.*;
import java.lang.*;
public class Solution
{
    public static void main(String[] args)
    {
        Human ded1 = new Human("ded1",67,true);
        Human ded2 = new Human("ded2",64,true);
        Human baba1 = new Human("baba1",62,false);
        Human baba2 = new Human("baba2",60,false);
        Human pahan = new Human("pahan",40,true);
        Human matka = new Human("matka",39,false);
        Human rebe1 = new Human("rebe1",6,true);
        Human rebe2 = new Human("rebe2",7,false);
        Human rebe3 = new Human("rebe3",2,true);

        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(baba1.toString());
        System.out.println(baba2.toString());
        System.out.println(pahan.toString());
        System.out.println(matka.toString());
        System.out.println(rebe1.toString());
        System.out.println(rebe2.toString());
        System.out.println(rebe3.toString());
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father, mother;
        public Human(String name, int age, boolean sex, Human father, Human mother){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }
        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
