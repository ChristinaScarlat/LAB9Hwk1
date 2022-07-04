package AnimalResquer;

public class AppMain {

    public static void main(String[] args){
        Dog ralph = new Dog();
        System.out.println(ralph.getName());
        ralph.setName("Ralph");
        ralph.play();
        ralph.eat();
        ralph.speak();
        ralph.sleep();

      //  Dog rex = new Dog("Rex", 2,"bishon");
      //  rex.setName("Rex");
    }
}
