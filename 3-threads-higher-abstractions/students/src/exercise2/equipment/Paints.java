package exercise2.equipment;

import java.util.concurrent.BlockingQueue;

public class Paints {


    private BlockingQueue queue;

    public Paints( BlockingQueue q) {
        this.queue = q;
    }


    public String takePaint() throws InterruptedException {
        return null;
    }

    public void returnPaint(String paint) {

    }
}
