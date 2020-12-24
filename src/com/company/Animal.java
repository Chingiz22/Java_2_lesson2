package com.company;

public class Animal implements Printable {
    private String poroda;
    private int age;
    private String name;


    public Animal(String poroda, int age , String name) {
        this.poroda = poroda;
        this.age = age;
        this.name=name;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String print() {
        return null;
    }
}
