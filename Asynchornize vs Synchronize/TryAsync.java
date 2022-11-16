public class TryAsync extends Thread {

    @Override
    public void run(){
        String[] names = {"Long","Hoang","Pham"};
        int[] numbers = {1,7,9};

        /*synchronized (this){
            for(String i:names) System.out.println(i);
            for(int j : numbers) System.out.println(j);
        }*/

        for(String i:names) System.out.println(i);
        for(int j : numbers) System.out.println(j);


    }
    public static void main(String[] args) {
        TryAsync tryAsync = new TryAsync();
        Thread thread1 = new Thread(tryAsync);
        Thread thread2 = new Thread(tryAsync);

        thread1.start();
        thread2.start();

    }
}
