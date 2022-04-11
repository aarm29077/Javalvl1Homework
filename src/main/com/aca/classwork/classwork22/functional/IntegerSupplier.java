package com.aca.classwork.classwork22.functional;

import java.util.function.Supplier;

public class IntegerSupplier implements Supplier<Integer> {

    @Override
    public Integer get(){
        return 8;
    }
    // primitive to object - AUTO-BOXING;
}
