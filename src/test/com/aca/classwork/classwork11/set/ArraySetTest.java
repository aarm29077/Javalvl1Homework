package com.aca.classwork.classwork11.set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArraySetTest {
    private Set testSubject;

    @BeforeEach
    public void setUp(){
        testSubject = new ArraySet();
    }
    @Test
    public void testSize(){
        Assertions.assertEquals(0,testSubject.size());
    }
    @Test
    public void testSizeWhenOnlyIOneUserIsAdded(){
        testSubject.add(new User("f","l"));
        Assertions.assertEquals(1,testSubject.size());
    }
    @Test
    public void testSizeWhen5SameUserIsAdded(){
        testSubject.add(new User("f","l"));
        testSubject.add(new User("f","l"));
        testSubject.add(new User("f","l"));
        testSubject.add(new User("f","l"));
        testSubject.add(new User("f","l"));
        testSubject.add(new User("f","l"));
        testSubject.add(new User("f","l"));
        testSubject.add(new User("f","l"));
        Assertions.assertEquals(1,testSubject.size());

    }
//    public static void main(String[] args) {
//        Set set= new ArraySet();
//        set.add(new User("F", "L"));
//        set.add(new User("F", "L"));
//        set.add(new User("F", "L"));
//        set.add(new User("F", "L"));
//        set.add(new User("F", "L"));
//        set.add(new User("F", "L"));
//        set.add(new User("F", "L"));
//
//        System.out.println(set.size());
//    }

}