package com.aca.classwork.classwork24;

public final class SafeBuffer<T> implements Buffer<T> {

    private T value;

    //erb mi qani thread e, ev methodnery synchroninzed en, mi treadi meji synchronized methodi popoxutyunnery cuyc kta nayev myus thtreai mej
    @Override
    public synchronized T get() throws InterruptedException {
        if (value == null) {
//            System.out.println("Cannot get value; waiting...");
            wait();
//            System.out.println("After get() wait");
        }
        T valueToReturn = value;
        value = null;
//        System.out.println("Before get() notify all");
        this.notifyAll();
//        System.out.println("After get() notify all");
        return valueToReturn;
    }

    @Override
    public synchronized void put(T t) throws InterruptedException {
        if (t == null) {
            throw new IllegalStateException("The provided value is null");
        }
        while (value != null) {
//            System.out.println("Cannot put() a value; waiting...");
            this.wait();
//            System.out.println("After put() wait");
        }
        this.value = t;
//        System.out.println("Before put() notify all");
        notifyAll();
//        System.out.println("After put() notify all");
    }

    //Producer Consumer
    public static void main(String[] args) {

//        Buffer<Integer> buffer = new SafeBuffer<>();
        Buffer<Integer> buffer = new BlockingBuffer<>();

        for (int i = 0; i < 10; i++) {
            final int final1 = i;
            Runnable putRunnable = () -> {
                try {
                    buffer.put(final1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            new Thread(putRunnable).start();
        }
        for (int i = 0; i < 10; i++) {
            Runnable getRunnable = () -> {
                try {
                    System.out.println("Printing " + buffer.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            new Thread(getRunnable).start();
        }
    }
}
