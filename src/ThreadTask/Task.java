package ThreadTask;


import java.util.concurrent.atomic.AtomicInteger;

class Task extends Thread {

    private String name1;

    public Task(String name1) {
        this.name1 = name1;
    }

    private static final AtomicInteger counter = new AtomicInteger();



    public void run() {
        System.out.println(name1 + " - " + Thread.currentThread().threadId() + " counter:" + getAndInc());
    }

    public  static Integer getAndInc() {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return counter.getAndIncrement();
    }

}

