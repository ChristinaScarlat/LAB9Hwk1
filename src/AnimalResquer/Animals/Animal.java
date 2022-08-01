package AnimalResquer.Animals;

import java.awt.*;
import java.util.Scanner;


public abstract class Animal {
    protected Scanner scanner = new Scanner(System.in);

    private int age;
    private String race;
    protected String name;
    public String color;
    private double weight;
    private int heightCm;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;

    }

    public String getRace(String siamese) {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(int heightCm) {
        this.heightCm = heightCm;
    }


    public abstract void eat();

    public abstract void sleep();

    public abstract void speak();

    public abstract void play();


}
