package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/



import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human child1 = new Human("got", 674, false);
        Human child2 = new Human("gotg", 467, false);
        Human child3 = new Human("gotf", 67, false);
        ArrayList<Human> childrenPokolenie1 = new ArrayList<Human>();
        childrenPokolenie1.add(child1);
        childrenPokolenie1.add(child2);
        childrenPokolenie1.add(child3);
        Human father = new Human("df", 545, true, childrenPokolenie1);
        Human mother = new Human("df", 545, false, childrenPokolenie1);
        ArrayList<Human> childrenPokolenieForDedBaba1 = new ArrayList<Human>();
        childrenPokolenieForDedBaba1.add(father);
        ArrayList<Human> childrenPokolenieForDedBaba2 = new ArrayList<Human>();
        childrenPokolenieForDedBaba2.add(mother);
        Human grandFather1 = new Human("etgfg",4554, true, childrenPokolenieForDedBaba1);
        Human grandMother1 = new Human("etfdgfgfg",45554, false, childrenPokolenieForDedBaba1);
        Human grandFather2 = new Human("etfdgfgfg",45554, true, childrenPokolenieForDedBaba2);
        Human grandMother2 = new Human("etfdfgfgfg",44455554, false, childrenPokolenieForDedBaba2);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandFather1);
        System.out.println(grandMother1);
        System.out.println(grandFather2);
        System.out.println(grandMother2);
    }

    public static class Human
    {
        //напишите тут ваш код
         String name;
         int age;
         boolean sex;
         ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, int age, boolean sex, ArrayList<Human> children){
            this.name = name;
            this.age = age;
            this.sex = sex;
            if(children.size() > 0){
                for(int i = 0; i < children.size(); i++){
                this.children.add(children.get(i));
                }
            }
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

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
