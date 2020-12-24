package com.company;

public class Pig extends  Animal
{
    private int kg;

    public Pig(String poroda, int age, String name, int kg) {
        super(poroda, age, name);
        this.kg = kg;
    }

    public int getKg() {
        return kg;
    }
    public void setKg(int kg) {
        this.kg = kg;
    }

    @Override
    public String print() {

        return (getPoroda() + " " + getName() + " " + getAge() + " " +getKg());
    }
}
