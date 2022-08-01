package AnimalResquer.Animals.Dog;


import AnimalResquer.Animals.Animal;

public class Dog extends Animal {

    public int age;

    public void waveTail() {
        System.out.println(getName() + " is waving the tail");
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void eat() {
        int F = 10;
        System.out.println("Level of hunger is 1 to" + F + ":");
        for (int i = 1; i <2; i++) {
            int x = scanner.nextInt();
            System.out.println("Choose a number for how hungry is :" +name);
            if (x <= 5)
                System.out.println(name + " is eating a snack. is" );
            if (x <= F)
                System.out.println(name + " is eating dog food!");
        }
    }

    @Override
    public void sleep() {
        System.out.println("Snores...zzz");

    }

    @Override
    public void speak() {
        System.out.println("Ham!");

    }

    @Override
    public void play() {
        System.out.println("Go fetch!");

    }
}