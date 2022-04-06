package com.aca.classwork.classwork25;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueMain {

    public static void main(String[] args) throws InterruptedException {
        //nerkayacnum e hert. Blocking e kochvum qani vor chenq karox azat mutqagrenq kam vercnenq
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(1);

        final Integer take = arrayBlockingQueue.take();
        final Integer poll = arrayBlockingQueue.poll();

        arrayBlockingQueue.put(10);
        arrayBlockingQueue.offer(10);
    }
}
