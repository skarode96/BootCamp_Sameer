package com.cdk.test;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by karodes on 8/1/2017.
 */
public class ConcurrentReaderWriter {
    public static void main(String[] args) {
        ConcurrentReaderWriter concurrentReaderWriter = new ConcurrentReaderWriter();
        concurrentReaderWriter.runReaderWriter();
    }

    LinkedBlockingQueue<Integer> linkedBlockingQueue = new LinkedBlockingQueue<Integer>();

    public void runReaderWriter() {
        Thread reader = new Thread(() -> {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    if (!linkedBlockingQueue.isEmpty())
                        System.out.printf(" Taking Elements from queue %s\n", linkedBlockingQueue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        reader.start();
        Thread writer = new Thread(() -> {

            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    if (linkedBlockingQueue.isEmpty())
                        linkedBlockingQueue.put((int) (Math.random() * 100));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        writer.start();
    }

}

