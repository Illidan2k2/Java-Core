abstract class DemoCode {
}

abstract class Coding{

}

abstract class Demoing extends DemoCode{

}

interface Examing{
    static void sound(){
        System.out.println("Hello");
    }
    final int a = 20;
}

interface Cloning{

}

interface Doing extends Examing, Cloning {

}

abstract class Lazy implements Cloning, Examing{
}



