public class Main {
    public static void main(String[] args) {
        DragonBoy dragonBoy = new DragonBoy();
        Thread t1 = new Thread(){
            @Override
            public void run(){
                dragonBoy.RandomNumber();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                dragonBoy.FilterNumber();
            }
        };
        t1.start();
        t2.start();

    }
}
