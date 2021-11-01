package com.company;

public class Pet {
    private String name;
    public String getName() { return name; }
    public Pet(String name){
        this.name=name;
    }
    @Override
    public String toString() {
        return name;
    };
}
class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }
}
class Dog extends Pet {
    public Dog(String name){
        super(name);
    }
}
class Owl extends Pet {
    public Owl(String name) {
        super(name);
    }
}
