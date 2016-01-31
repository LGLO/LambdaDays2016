package io;

public class TelephoneTime {

    String lastTime = getTime();

    public String getTime() {
        try {
            Thread.sleep(100);
        } catch (Exception ignore) {
        }
        return String.format(
                "%d millis since epoch", System.currentTimeMillis());
    }

    public void printTime() {
        System.out.println("Last time was: " + lastTime + ", now is: " + getTime());
    }
}
