public class ThreadYield extends Thread {

    private static ThreadYield threadYield;
    @Override
    public void run(){
        while (true) {
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
        }
    }

    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            threadYield = new ThreadYield();
            threadYield.start();
        }
    }
}
