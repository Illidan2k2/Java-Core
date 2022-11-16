class RunnableStudent implements Runnable{
    int counter = 0;

    @Override
    public void run(){
        counter++;
        System.out.println("ImplementRunable: Counter = "+counter);
        System.out.println(Thread.currentThread().getName());
    }
    public int getCounter(){
        return counter;
    }
}

class Main{
    public static void main(String[] args) throws InterruptedException {
        /*ThreadStudent a = new ThreadStudent();
        ThreadStudent a1 = new ThreadStudent();
        ThreadStudent a2= new ThreadStudent();*/

      /*  RunnableStudent b = new RunnableStudent();
        Thread t1 = new Thread(b);
        t1.setName("South");
        t1.start();
        *//*Thread.sleep(1000);*//*
        Thread t2 = new Thread(b);
        t2.setName("North");
        t2.start();
        *//*Thread.sleep(1000);*//*
        Thread t3 = new Thread(b);
        t3.setName("East");
        t3.start();
        Thread.sleep(1000);*/

        /*a.start();
        a1.start();
        a2.start();*/

        RunnableStudent b = new RunnableStudent();
        RunnableStudent b1 = new RunnableStudent();
        RunnableStudent b2 = new RunnableStudent();

        b.run();
        b1.run();
        b2.run();
    }
}