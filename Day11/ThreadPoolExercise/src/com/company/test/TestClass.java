package com.company.test;

import com.company.tasks.TaskA;
import com.company.thread.ExecutorService;
import org.junit.Test;

/**
 * Created by karodes on 8/1/2017.
 */
public class TestClass {
    @Test
    public void test1() {

        ExecutorService executorService = new ExecutorService();
        for (int i = 0; i < 100; i++) {
            executorService.execute(new TaskA());
        }
    }
}
