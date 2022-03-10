package com.aca.classwork.classwork13.annotations;


import java.lang.annotation.Annotation;

class StringMakerTest {
    public static void main(String[] args) {
//        StringMaker bad = StringMaker.ofBad();
//
//        StringMaker good = StringMaker.ofGood();
//
//        System.out.println(bad.getClass().getDeclaredAnnotations()[0].annotationType());

        StringMaker[] stringMakers = {StringMaker.ofBad(),StringMaker.ofGood()};

        for (StringMaker stringMaker: stringMakers) {
            Annotation[] declaredAnnotations = stringMaker.getClass().getDeclaredAnnotations();
            if (declaredAnnotations.length>0 && declaredAnnotations[0].annotationType()==HighPerformance.class){
                System.out.println(stringMaker.make(1,100_000).getDuration());
            }
        }
    }

}