package com.aca.homework.week12.temperature;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ItemWrite<T> {

    void write(T item) throws IOException;


}
