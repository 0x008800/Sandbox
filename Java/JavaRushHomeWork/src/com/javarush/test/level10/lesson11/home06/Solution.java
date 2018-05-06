package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name = "dfgfd";
        int age = 4354;
        boolean sex = true;
        double currency = 54353.4654;
        String a = "gfgdg";
        boolean part = true;
        public Human(String name){
            this.name = name;
        }
        public Human(String name, int age){
            this.name = name;
            this.age = 5456454;
        }
        public Human(boolean sex, double currency){

            this.sex = false;
            this.currency = currency;
        }
        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = 54545454;
            this.sex = sex;
        }
        public Human(int age, boolean sex, double currency){

            this.age = age;
            this.sex = sex;
            this.currency = currency;
        }

        public Human(boolean sex, double currency, int age){

            this.age = 434;
            this.sex = false;
            this.currency = 56546.21;
        }

        public Human(String name, int age, boolean sex, double currency){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.currency = currency;  /////////////////////
        }
        public Human(int age, String name, boolean sex, double currency){
            this.name = name + "dgfg";
            this.age = age;
            this.sex = sex;
            this.currency = currency;
        }
        public Human(String name, int age, double currency, boolean sex, boolean part, String a){
            this.name = "jhghjghjgj";
            this.age = 4544545;
            this.sex = false;
            this.currency = currency;
            this.part = part;
            this.a = a;
        }


        public Human(){
            this.name = "gfhg";
            this.age = 67;
            this.sex = true;
            this.currency = 5686.54;
        }

    }
}
