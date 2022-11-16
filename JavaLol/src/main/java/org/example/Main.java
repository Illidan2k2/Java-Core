package org.example;

public class Main {
    Lock locker = new Lock() {
        @Override
        public void requestCS(int tid) {
            int array[] = {1,5,7,2,8,9};
            for(int i : array){
                System.out.println(i);
            }
        }

        @Override
        public void releaseCS(int tid) {
            String name[] = {"Long","Hoang","Pham","Phong","Chuong"};
            for(String i : name){
                System.out.println(i);
            }
        }
    };
    public static void main(String[] args) {
        Main main = new Main();
        Dekker dekker = new Dekker();
        dekker.lock = main.locker;
        Thread t1 = new Thread(){
            @Override
            public void run(){
                dekker.run();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run(){
                dekker.run();
            }
        };
        t1.start();
        t2.start();

    }
}