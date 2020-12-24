package com.company;

public class Dog extends Animal  {

    private String commands;

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands){
        this.commands = commands;
    }

    public Dog(String paroda, int age, String name, String commands) {
        super(paroda, age, name);



    }

    @Override
    public String print() {

        return (getPoroda() + " " + getName() + " " + getAge() + " " + getCommands());

    }
}


