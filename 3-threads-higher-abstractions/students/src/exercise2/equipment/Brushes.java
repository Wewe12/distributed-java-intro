package exercise2.equipment;


import java.util.concurrent.BlockingQueue;


public class Brushes {


    private BlockingQueue queue;

    public Brushes( BlockingQueue q) {
        this.queue = q;
    }

    public String takeBrush() throws InterruptedException {
        return null;
    }

    public void returnBrush(String brush) {

    }
}
