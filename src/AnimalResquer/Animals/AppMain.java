package AnimalResquer.Animals;

import AnimalResquer.Animals.Dog.Dog;


public class AppMain {

    public static void main(String[] args) {
        Dog ralph = new Dog();
        System.out.println(ralph.getName());
        ralph.setName("Ralph");
        ralph.play();
        ralph.eat();
        ralph.speak();
        ralph.sleep();

        Dog rex = new Dog();
        rex.setName("Rex");
        rex.speak();
        rex.setAge();
        rex.getAge();
        rex.getHeightCm();
        rex.waveTail();


        Dog grivey = new Dog();
        grivey.setName("Grivey");
        grivey.eat();

        Duck ducky = new Duck();
        ducky.setName("Ducky");
        ducky.play();
        ducky.eat();

        Cat kitty = new Cat();
        kitty.setName("Kitty");
        kitty.setRace("Siamese!");
        kitty.setColor("is black");
        kitty.eat();
        kitty.sleep();
        kitty.speak();

        Siamese Selina = new Siamese();
        Selina.setName("Selina");
        Selina.play();
        Selina.speak();
        Selina.getRace("Siamese");


    }
}
