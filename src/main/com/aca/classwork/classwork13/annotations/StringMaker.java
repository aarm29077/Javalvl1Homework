package com.aca.classwork.classwork13.annotations;


import com.aca.classwork.classwork13.perfomance.StringMakerResult;
import com.aca.classwork.classwork13.perfomance.StringMakerResult;

public interface StringMaker {

    StringMakerResult make(int start, int end);

    static StringMaker ofBad(){
        return new BadStringMaker();
    }
    static StringMaker ofGood(){
        return new GoodStringMaker();
    }

}
