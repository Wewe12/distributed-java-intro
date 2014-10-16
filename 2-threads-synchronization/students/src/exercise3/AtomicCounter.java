package exercise3;

import common.Counter;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicCounter implements Counter {

    private AtomicLong atomic = new AtomicLong();
    @Override
    public void increment() {
        atomic.incrementAndGet();

    }

    @Override
    public long getValue() {
        return atomic.longValue();
    }
}
