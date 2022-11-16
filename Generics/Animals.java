import javax.print.attribute.standard.OrientationRequested;

class Animalss {
    public void Sound(){
        System.out.println("Hello World");
    }
}

class Dogs extends Animalss{
    public void Bark(){
        System.out.println("Woof Woof");
    }
}

class Printer <T extends Animalss>{
    T Thing;

    public Printer(T Thing){
        this.Thing = Thing;
    }

    public void Print(){
        Thing.Sound();
    }

    public static void main(String[] args) {
        Animalss animals = new Animalss();
        Printer<Animalss> printer = new Printer<>(animals);
        printer.Print();

        Dogs dog = new Dogs();
        Printer<Dogs> husky = new Printer<>(dog);
        husky.Thing.Bark();
    }

    public <E> E SystemPrint(E type){
        return type;
    }
}


