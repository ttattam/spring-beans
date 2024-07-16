package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {

    private final Long time;

    public Timer() {
        this.time = System.currentTimeMillis();
    }

    public Long getTime() {
        return time;
    }
}
