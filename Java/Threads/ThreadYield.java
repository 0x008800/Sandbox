public class ThreadYield extends Thread {

    @Override
    public void run(){

        while (true) {
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
        }
    }

    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            ThreadYield threadYield = new ThreadYield();
            threadYield.start();
        }
    }
}
