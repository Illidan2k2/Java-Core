public class Dog extends Animal{
    @Override
    public void Sound() {
        System.out.println("Woof woof");
    }

    @Override
    public void Sound(String pitch) {
        System.out.println(pitch);
    }

    @Override
    public void Sound(String type, String frequency) {
        super.Sound(type, frequency);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Sound();
        dog.Sound("Wee");
        dog.Sound("Howl","32 Hz");
    }
}
