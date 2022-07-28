package AnimalResquer.Animals;

import java.awt.*;
import java.util.Scanner;


public class Animal {
    Scanner scanner = new Scanner(System.in);

    private int age;
    private String race;
    String name;
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


    public void eat() {
        int F = 10;
        System.out.println("Choose a number for how hungry is :" + name);
        System.out.println("Level of hunger is 1 to" + F + ":");
        int x = scanner.nextInt();

        if (x <= 5)
            System.out.println(name + " is eating a snack.");
        else if (x <= F)
            System.out.println(name + " is eating real food!");

}

    public void sleep() {
        System.out.println(name + " Snores...zzz");
    }

    public void speak() {
        System.out.println(name + ":Ham Ham!");
    }

    public void play() {
        System.out.println("Go play!"+ name);
    }




}
