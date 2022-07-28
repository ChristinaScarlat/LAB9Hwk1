package AnimalResquer.Animals;


    public class Cat extends Animal {
        private String race;
        // public void eat() {
        //    System.out.println(name + " is eating Purrina");
   // }

        public void speak(){
            System.out.println("Miau!");
        }

        @Override
        public void play() {
            System.out.println(name +" plays with a mouse!");
        }
    }
