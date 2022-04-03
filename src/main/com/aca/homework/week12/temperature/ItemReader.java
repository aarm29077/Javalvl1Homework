package com.aca.homework.week12.temperature;

import java.io.IOException;

public interface ItemReader<T> {

    void read(T item) throws IOException;
}
