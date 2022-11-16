public class DemoReference {
    // Object::methodName
    // Shorter than lambda in some cases
    public static void main(String[] args) {

        // Lambda

        /*Animals animals = n-> System.out.println(n);
        animals.say("Hello");*/

        //Method

        /*Animals animals = System.out::print;
        animals.say("Hello");*/

        Animals pitbull = DemoReference::refer;

        Animals alaska = DemoReference::refer;

        pitbull.say("Sound");
        alaska.say("Howl");

    }
    public static void refer(String n){
        System.out.println(n+ " : Woof woof");
        System.out.println(n+ " : Woof woof");
        System.out.println(n+ " : Woof woof");
        System.out.println(n+ " : Woof woof");
        System.out.println(n+ " : Woof woof");
    }
}

@FunctionalInterface
interface Animals{
    void say(String n);
}
