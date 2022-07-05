package Dog;

import java.util.Scanner;

public class Dog {
    Scanner scanner = new Scanner(System.in);

    private int age;
    private String race;
    private String name;
    private String color;
    private double weight;
    private int heightCm;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String snackvita;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRace() {
        return race;
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

    public String getSnackvita() {
        return snackvita;
    }

    public void setSnackvita(String snackvita) {
        this.snackvita = snackvita;
    }

    public int x;

    public void eat() {
        int F = 10;
        System.out.println("Level of hunger is 1 to" + F + ":");
        for (int i = 1; i <= F; i++) {
            int x = scanner.nextInt();
            System.out.println("Choose a number for how hungry is Ralph:");
            if (x <= 5)
                System.out.println(name + " is eating a snack. is" + snackvita);
            if (x <= F)
                System.out.println(name + " is eating real food!");
        }
        System.out.println(name +"It's now hungry!");
    }

    public void sleep() {
        System.out.println("Snores...zzz");
    }

    public void speak() {
        System.out.println("Ham!");
    }

    public void play() {
        System.out.println("Go fetch!");
    }


}