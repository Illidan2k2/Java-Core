public class DemoSync implements Runnable {
    String[] a = {"Long","Hoang","Hoa"};
    int[] b = {3,7,9,0};

    @Override
    public  void run() {
            for(String n : a) System.out.println(n);
            for(int i : b) System.out.println(i);
    }

    public static void main(String[] args) {
        DemoSync demoSync = new DemoSync();
        Thread t1 = new Thread(){
            @Override
            public void run(){
                demoSync.run();
                System.out.println("Jester");
            }
        };
        Thread t2 = new Thread(){
          @Override
          public void run(){
              demoSync.run();
              System.out.println("Joker");
          }
        };
        t1.start();
        t2.start();
    }

}
