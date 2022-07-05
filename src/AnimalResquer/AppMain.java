package AnimalResquer;

import Dog.Dog;

public class AppMain {

    public static void main(String[] args){
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

        Dog grivey = new Dog();
       grivey.setName("Grivey");
        grivey.eat();

        Duck ducky = new Duck();
        ducky.setName("Ducky");
        ducky.play();

        Cat kitty = new Cat();
        kitty.setName("Kitty");
        kitty.getRace();

        kitty.sleep();

    }
}
