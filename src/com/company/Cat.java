package com.company;

public class Cat extends Animal  {

    private String color;
    public Cat(String poroda, int age, String name, String color) {
        super(poroda, age, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String print() {

        return (getPoroda() + " " + getName() + " " + getAge() + " " + getColor());
    }
}
