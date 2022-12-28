package ThreadTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Test {
    static final int MAX_T = 30;
    public static void main(String[] args) {

        int numThreads = 100;

        for (int i = 0; i < numThreads; i++) {
            Task c = new Task("normal");
            c.run();
        }


        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

        for (int i = 0; i < numThreads; i++) {

            pool.submit(new Task("pool"));

        }
    }
}
