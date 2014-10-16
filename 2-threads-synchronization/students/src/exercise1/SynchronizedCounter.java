package exercise1;

import common.Counter;

public class SynchronizedCounter implements Counter {

    private long x = 1;

    @Override
    public synchronized void increment() {
        this.x++;
    }

    @Override
    public long getValue() {
        return x;
    }
}
