public class DemoThreads {

    static void builderTime(){
        StringBuilder builder = new StringBuilder();

        long start_time = 0;
        long end_time = 0;

        start_time = System.currentTimeMillis();
        for(int i =0; i<10000000;i++){
            builder.append(i);
        }
        end_time = System.currentTimeMillis();
        System.out.println(end_time-start_time);
    }

    static void bufferTime(){
        StringBuffer buffer = new StringBuffer();

        long start_time = 0;
        long end_time = 0;

        start_time = System.currentTimeMillis();
        for(int i =0; i<10000000;i++){
            buffer.append(i);
        }
        end_time = System.currentTimeMillis();
        System.out.println(end_time-start_time);
    }

    public static void main(String[] args) {
        DemoThreads.bufferTime();
        DemoThreads.builderTime();
    }
}
