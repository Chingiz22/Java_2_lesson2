package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Алабай", 4, "Чапи", "Голос");
        Pig pig = new Pig("Свинья", 1, "Чип", 345);
        Cat cat = new Cat("Британская", 2, "Симба", "Серый");
        System.out.println(cat.print() + " " + dog.print() + " " + pig.print());
        System.out.println(createObject(dog.print()));
        createObject("Cat").print();

    }

    public static Animal createObject(String className) {
        if (className.equals(Cat.class.getSimpleName())) {
            return new Cat("Британская", 4, "Симба", "Серый");


        } else if (className.equals(Pig.class.getSimpleName())) {
            return new Pig("Свинья", 1, "Чип", 345);


        } else if (className.equals(Dog.class.getSimpleName())) {
            return new Dog("Алабай", 4, "Чапи", "Голос");
        } else {
            return null;

        }
    }

}









