package AnimalResquer.Animals;

public class Duck extends Animal{
    public void eat() {
        System.out.println(name + " eating corn");
    }

    @Override
    public void sleep() {

    }

    public void speak(){
        System.out.println("Quack quack");
    }

    @Override
    public void play() {

    }


}
