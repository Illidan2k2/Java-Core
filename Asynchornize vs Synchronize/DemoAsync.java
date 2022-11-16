public class DemoAsync {
   /*synchronized public void Print(String name){
       nt i = 1;
       // Dong bo
       while(i ++ < 10) System.out.println(name+" Hello World! "+i);i
    }
    */
    synchronized static void RunPrint(String name){
        int i = 1;
        // Dong bo
        while(i ++ < 10) System.out.println(name+" Hello World! "+i);
    }

    //Main thread
    public static void main(String[] args) {
        DemoAsync demo1Async = new DemoAsync();
        DemoAsync demo2Async = new DemoAsync();
        // Another threads
        Thread t1 = new Thread(){
            @Override
            public void run(){
                RunPrint("Long");
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run(){
                RunPrint("Long");
            }
        };
        // Bat dong bo
        t1.start();
        t2.start();
    }
}
