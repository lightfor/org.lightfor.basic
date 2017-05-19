package org.lightfor.basic;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * delayed element
 * Created by Light on 2017/5/19.
 */
public class DelayedElement implements Delayed{
    private final long delay;
    private final long expire;
    private final String message;
    private final long now;

    public DelayedElement(long delay, String message) {
        this.delay = delay;
        this.message = message;
        this.now = System.currentTimeMillis();
        this.expire = this.now + delay;

    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(this.expire - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return (int) (this.getDelay(TimeUnit.MILLISECONDS) - o.getDelay(TimeUnit.MILLISECONDS));
    }

    @Override
    public String toString() {
        return "DelayedElement{" +
                "delay=" + delay +
                ", expire=" + expire +
                ", message='" + message + '\'' +
                ", now=" + now +
                '}';
    }
}
