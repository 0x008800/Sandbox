package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man man = new Man("v", 7, "56");
        Woman woman = new Woman("hghj", 78, "klara");
        Man man1 = new Man("vfdgh", 23, "65656");
        Woman woman1 = new Woman("hgjhg", 45, "klara");


        //выведи их на экран тут
        System.out.println(man);
        System.out.println(woman);
        System.out.println(man1);
        System.out.println(woman1);
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(int age, String address, String name){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public  Man(String name, String address, int age){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public  Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString(){
        return this.name + " " + this.age + " " + this.address;
        }
    }


        public static class Woman{
            String name;
            int age;
            String address;



            public  Woman(String name, int age, String address){
                this.name = name;
                this.age = age;
                this.address = address;
            }
            public String toString(){
                return this.name + " " + this.age + " " + this.address;
            }
        }
}