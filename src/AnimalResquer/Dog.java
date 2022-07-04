package AnimalResquer;

import java.util.Scanner;

public class Dog {
    Scanner scanner = new Scanner(System.in);

    private int age;
    private String race;
    private String name;
    private String color;
    private double weight;
    private int heightCm;
    public int x;

   // Dog(String name, int age, String race, double weight, int heightCm) {
    //    this.name = name;
      //  this.age = age;
      //  this.race = race;
      //  this.weight = weight;
      //  this.heightCm = heightCm;
  //  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String snackvita;


    public void eat() {
        int F = 10;
        System.out.println("Level of hunger is 1 to" + F + ":");
        for (int i = 1; i <= F; i++) {
            int x = scanner.nextInt();
            System.out.println("Choose a number for how hungry is Ralph:");
            if (x <= 5)
                System.out.println("Ralph is eating a snack. is" + snackvita);
            if (x <= F)
                System.out.println("Ralph is eating dog food!");
        }
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