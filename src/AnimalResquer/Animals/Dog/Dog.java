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
}