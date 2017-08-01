package com.cdk.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by karodes on 8/1/2017.
 */
public class ExecutorService {
    Executor executor = null;

    public ExecutorService() {
        executor = Executors.newCachedThreadPool();
//        executor = Executors.newFixedThreadPool(2);
    }

    public void execute(Runnable runnable) {
        executor.execute(runnable);
    }

}
