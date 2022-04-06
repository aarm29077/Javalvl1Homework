package com.aca.classwork.classwork25;

public final class UnsafeBuffer<T> implements Buffer<T> {

    private T value;

    //erb mi qani thread e, ev methodnery synchroninzed en, mi treadi meji synchronized methodi popoxutyunnery cuyc kta nayev myus thtreai mej
    @Override
    public synchronized T get() {
        if (value == null) {
            throw new IllegalStateException("The buffer is empty");
        }
        T valueToReturn = value;
        value = null;

        return valueToReturn;
    }

    @Override
    public synchronized void put(T t) {
        if (t == null) {
            throw new IllegalStateException("The provided value is null");
        }
        if (value != null) {
            throw new IllegalStateException("The buffer is full");
        }
        this.value = t;
    }
}
