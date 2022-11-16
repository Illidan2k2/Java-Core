package Static_class;

public class Species {
    public void Sounds(){
        System.out.println("Hello World!");
    }
    //Inner class
    class Dog{
        public void Bark(){
            System.out.println("Woof woof");
            Sounds();
        }
    }

    //Static nested-class
    static class Kitten{
        public static void Roar(){
            System.out.println("Keeewww");
        }

        public void Scratch(){
            System.out.println("Cloak and Dagger");
        }
    }
}

class Implementation{
    public static void main(String[] args) {
        Species species = new Species();
        Species.Dog dog = species.new Dog();

        Species.Kitten kitten = new Species.Kitten();
        Species.Kitten.Roar();

    }

}
