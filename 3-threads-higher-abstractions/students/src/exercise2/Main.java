package exercise2;

import exercise2.equipment.Brushes;
import exercise2.equipment.Paints;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue paintQueue = new ArrayBlockingQueue(5);
        BlockingQueue brushQueue = new ArrayBlockingQueue(5);


        Paints paints = new Paints();
        Brushes brushes = new Brushes();

        for (int i =0; i<5; i++){
            paintQueue.offer(new Paints());
        }

        ExecutorService executors = Executors.newCachedThreadPool();
        for (int i = 0; i < 32; ++i) {
            executors.execute(new Painter(paints, brushes));
        }
        executors.shutdown();
        executors.awaitTermination(30, TimeUnit.SECONDS);
    }
}
